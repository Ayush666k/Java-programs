import java.util.*;
class CyclicSort{
    public static void main(String[] args){
        // NOTE : when you get number range is 1 to  n use cyclic sort
        int arr[] = { 5, 4, 3, 2, 1};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Cyclic(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}