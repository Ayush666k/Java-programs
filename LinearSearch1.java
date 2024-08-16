import java.util.*;
class LinearSearch1
 {
    public static void main(String[]  args){
        int[] nums = { 1, 5, 7, 2, 98, 2, 67, 69};
        int target = 5;
        int ans = LinearSearch2(nums, target);
        System.out.println(ans);
    }

    
    static int LinearSearch2(int[]  arr,int target){
        if(arr.length == 0);{
        return -1;
    }
    for(int index = 0; index < arr.length; index++){
        int element == arr[index];
        if(element == target){
            return element;
           }
        }
        return -1;
        
        
    }
}