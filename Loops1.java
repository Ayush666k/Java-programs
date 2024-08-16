import java.util.*;
class Loops1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a > b && a >c){
            System.out.println(a);
        }
        else if(b > a && b > c){
            System.out.println(b);
        }
        else {
            System.out.println(c);
            }
    }
}
// int max = math.max(c,math.max(a,b));
//  System.out.println(max);