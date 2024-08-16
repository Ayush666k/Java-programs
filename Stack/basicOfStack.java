
import java.util.*;
public class basicOfStack {
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println("Enter number you want to insert");
        //  n = sc.nextInt();
        //  System.out.println("Enter the element : ");
        //  for(int i = 0; i < n; i++){
        //     int x = sc.nextInt();
        //     st.push(x);
        //  }
        //  System.out.println(st);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx = 2;
        int  x = 7;
        Stack<Integer> temp = new Stack<>();
        while(st.size() > idx){
            temp.push(st.pop());

        }
        st.push(x);
        while(temp.size() > 0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
    
}
