import java.util.*;
class Array3{
    public static void main(String[] args){
        int[] nums = {2, 4, 9, 58, 68};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString((nums)));
    }
    static void change(int[] arr){
        arr[0] = 99;
        
    }
    
}