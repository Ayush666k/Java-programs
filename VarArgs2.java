import java.util.Arrays;
import java.lang.String;
class VarArgs2{
    public static void main(String[]  args){
        multiple(2, 5,   "Naruto Uzumaki", "Uchiha Sasuke", "Haruna Sakura");
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a + " " + b + " " + v);
    }
    
}