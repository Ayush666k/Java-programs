import java.util.*;
class FunctionOverloading{
    public static void main(String[] args){
        demo(2,3);

    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}