import java.util.*;
class ArrayReverse{
    public static void main(String[]  args){
        int[] arr = { 2, 3, 6, 9, 14};
        
       Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}