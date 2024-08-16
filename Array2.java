import java.util.*;
class Array2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
         str[1] = " UCHIHA MADARA";

         System.out.println(Arrays.toString(str));
    }
}