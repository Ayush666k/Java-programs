import java.util.*;
class Method{
    public static void main(String[] args){
        sum();

    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First element: ");
        int num1 = in.nextInt();
        System.out.println("Enter the Second element");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The  sum: " + sum);
    }
}