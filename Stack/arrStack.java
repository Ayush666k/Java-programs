public class arrStack {

    public static class Stack {
        private int[] arr = new int[5];
        private int index = 0;

        void push(int x) {
            arr[index] = x;
            index++;
        }

        int peek(){
            if (index == 0) {
                return -1;
            }
            return arr[index - 1];
        }

        int pop(){
            if (index == 0) {
                return -1;
            }
            int top = arr[index - 1];
            arr[index - 1] = 0;
            index--;
            return top;
        }

        void display() {

            for (int i = 0; i <= index - 1; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return index;
        }

    }
    

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        
        st.display();
        System.out.println(st.size());
    }

}
