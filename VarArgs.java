 import java.util.*;
class VarArgs{
    public static void main(String[] args){
        fun(2 , 3 , 5 , 5, 78, 100);

    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}