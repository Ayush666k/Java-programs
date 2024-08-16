package LinkedList;

public class DoublyLinkedList {



    
       private Node head;
       
      
    
        public void insertFirst(int val){
            Node node = new Node(val);
            node.next = head;
            node.prev = null;
            if (head != null){
                node.prev = node;
            }
            head = node;
        }
        public void display() {
            Node node = head;
            while (node != null){
                System.out.print(node.val + " -> ");
                node = node.next;
            }
            System.out.println("END");
        }
    
        private class Node{
           int val;
           Node next;
           Node prev;
           public Node(int val) {
            this.val = val;
           }
           public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
    
           }
    
    
        }
    
    
        public static void main(String args[]){
            DoublyLinkedList list = new DoublyLinkedList();
            list.insertFirst(3);
            list.insertFirst(34);
            list.insertFirst(34);
            list.insertFirst(56);
            list.insertFirst(69);
            list.display();
        }
    
    
}
