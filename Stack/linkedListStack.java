public class linkedListStack {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    public static class Stack {
        private Node head = null;
        private int Size = 0;

        void push(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            Size++;

        }

        int pop() {
            if (head == null) {
                return -1;

            }

            
             int x = head.data;
             head = head.next;
             Size--;
             return x;

        }
        int peek(){
        if(head == null){
        return -1;

        }
        int tp = head.data;
        return tp;
       // return head.data;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;

            }
            System.out.println();
        }

        int size() {
            return Size;
        }

    }

    public static void main(String[] args) {
        Stack ll = new Stack();
        ll.push(11);
        ll.push(12);
        ll.push(13);
        ll.push(14);
        ll.display();
        ll.pop();
        ll.display();
        
        System.out.println(ll.size());
    }

}
