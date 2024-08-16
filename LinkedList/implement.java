public class implement {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;

        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        void insertEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        void insertHead(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;

            }
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;

            }
        }

        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insertAt(int index,  int val){
            Node t = new Node(val);
            Node temp =  head;
            if(index == size()){
                insertEnd(val);
                return;
            }else if(index == 0){
                insertHead(val);
                return;

            }
            for(int i = 1; i <= index - 1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
    
    
            }
       
    }


    



    
    
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.insertEnd(4);
        ll.insertEnd(5);
        ll.insertEnd(7);
      //  ll.display();
      //  System.out.println(ll.size());
       ll.insertHead(9);
      // ll.display();
       ll.insertAt(2,9);
       ll.display();

        

    }
}
