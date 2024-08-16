import java.util.*;
class SwapArray{
    public static void main(String[] args){
        int[] arr = {1, 5, 23, 78};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}