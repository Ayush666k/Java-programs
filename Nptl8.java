import java.util.*;
import java.lang.*;
class Nptl8{
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter Two Number To Get Greater Number");
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        if (a > b){
            System.out.printf("Between %d and %d, maximum is %d", a, b, a);

        }
        else{
            System.out.printf("Between %d and %d, maximum number is %d \n" );
        }
    }

}