package TREEES;
import java.util.*;
public class BT {
    public BT() {

    }

  private static class Node {
        int Value;
        Node left;
        Node right;

        public Node(int Value) {
            this.Value = Value;
        }
       
    }

    private Node root;

    // insert node
    public void populate(Scanner scanner) {
        System.out.println("Enter the Root node: ");
        int Value = scanner.nextInt();
        root = new Node(Value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node Node) {
        System.out.println("Do you want enter left of " + Node.Value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of: " + Node.Value);
            int Value = scanner.nextInt();
            Node.left = new Node(Value);
            populate(scanner, Node.left);

        }
        System.out.println("Do you want enter Right of " + Node.Value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + Node.Value);
            int Value = scanner.nextInt();
            Node.right = new Node(Value);
            populate(scanner, Node.right);
        }

    }

    public void display() {
        display(this.root, "");
    }

   private void display(Node Node, String indent){
    if (Node == null){
        return;
    }
    System.out.println(indent + Node.Value);
      display(Node.left, indent + "\t");
      display(Node.right, indent + "\t");
}
public void  prettyDisplay(){
    prettyDisplay(root, 0);
}
private void prettyDisplay(Node Node, int level){
    if(Node == null) {
        return;
    }

    prettyDisplay(Node.right, level + 1);

    if(level != 0){
        for(int i = 0; i < level - 1; i++){
            System.out.println("|\t\t");
        }
        System.out.println("|-------->" + Node.Value);
    }
    else{
        System.out.println(Node.Value);
    }
    prettyDisplay(Node.left, level + 1);
    
}
// to check its are in preorder same steps for postorder and inorder

public void preOrder(){
    preOrder(root);
}

private void preOrder(Node node){
    if (node == null){
      return;
    }
    System.out.print(node.Value + " ");
    preOrder(node.left);
    preOrder(node.right);
}


public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    BT tree = new BT();
    tree.populate(scanner);
    tree.prettyDisplay();
}   

}