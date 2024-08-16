import java.util.*;
class BubbleSort {
    public static void main(String[] args){
        int[] arr  = {1, 2, 3, 4, 5};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Bubble(int[] arr){
        boolean swapped;
        // run the step n - 1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            // for each step, max item will come at the last respective index

            for(int j = 1; j < arr.length - i; j++){

                // swap if item smaller than previous item

                if(arr[j] < arr[j - 1]){

                    // swap

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;

                }


            }
            // if you did not swap for a particular vaiue if i, it mean array is sorted
            if(!swapped){
                break;
            }




        }
    }
}