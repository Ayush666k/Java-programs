import java.util.*;
public class Sort {


    public static void main(String args[]){
        int[] arr ={0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void sort(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                count += 1; 
            }
        }
        for(int i = 0; i < n; i++){
            if(i < count){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;

            }
        }


    }


    
}
