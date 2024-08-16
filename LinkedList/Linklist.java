//package LinkedList;

public class Linklist {

    public static int length(Node a){
        int count = 0;
        while(a != null){
            count++; 
            a = a.next;
        }
        return count;
    }

    public static void displayR(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.data + " ");
        display(head.next);
    }
    

    public static void display(Node head){
        
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }


    public static class Node{
        int data;
        Node next;

        public Node(int data){

            this.data = data;

        }
    }

    public static void main(String[] args){
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


    
        
        // DO WHILE LOOP FOR IF DONT KNOW HOW MUCH TIMES HE RUN
        // while(temp != null){
        //     System.out.println(temp.data + " ");
        //     temp = temp.next;
        // }
       // display(a);

      //  displayR(a);

      System.out.println(length(a));


    }
    
}
