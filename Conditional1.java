import java.util.*;
class Conditional1 {
    public static void main(String[]  args){
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        } else{
            System.out.println("Lowercase");
        }

    }

}