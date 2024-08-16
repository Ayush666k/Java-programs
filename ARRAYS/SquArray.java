import java.util.*;

public class SquArray {
    public static void main(String args[]){
        int[] arr = {-10, 5, 1, 5, -3};
        int[] ans = sortSquare(arr);
      //  reverseArray(ans);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sortSquare(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = n - 1;

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--] = arr[left] * arr[left];
                left++;
                

            }else{
                ans[k] = arr[right] * arr[right]; 
                k--;
                right--;

            }
        }
        return ans;
    }
}
