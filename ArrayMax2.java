import java.util.*;
class ArrayMax2{
    public static void main(String[] args){
        int arr[] = { 1, 4, 7, 2, 9};
        System.out.println(maxRange(arr,1,3));
    }
    static int maxRange(int[] arr, int start, int end) {
        int maxval = arr[start];
        for(int i = start; i <= end; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }

        }
        return maxval;
    }
    
}