import java.util.*;
import java.lang.*;
class LinearSearch4 {
    public static void main(String[] args){
        int[] arr = {18, 12, -7, 34, 69,};
        System.out.println(min(arr));
    }
     
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; 1< arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}