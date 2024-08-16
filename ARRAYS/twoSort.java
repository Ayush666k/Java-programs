import java.util.Arrays;

public class twoSort {

    public static void main(String args[]){
        int[] arr = {1, 1 ,1, 0, 1, 0, 0, 0};
        twoPointerSwap(arr);
        System.out.println(Arrays.toString(arr));
        

    }
    public static void twoPointerSwap(int[] arr){
        int n = arr.length;
        int start = 0;
        int End = n - 1;

        while (start < End) {
            if(arr[start] == 1 && arr[End] == 0 ){
                swap(arr, start, End);
                start++;
                End--;

            }
         
            if(arr[start] == 0){
                start++;
            }
            if(arr[End] == 1){
                End--;
            }

        }
        

       
        }

       
        


    static void swap(int[] arr, int start, int End){
        int temp = arr[start];
        arr[start] = arr[End];
        arr[End]  = temp;
    }
    
}
