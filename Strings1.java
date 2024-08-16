import java.lang.*;
import java.util.*;
class Strings1 {
    public static void main(String[] args){
        // creating these value outside the pool, it will pointing different object
        String  a = new String("Naruto");
        String  b = new String("Naruto");
        System.out.println(a == b);
        // if you want check only values
        System.out.println(a.equals(b));
        System.out.println(b.charAt(0));
    }
}