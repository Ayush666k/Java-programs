import java.util.*;
public class FindUnique {

    public static void main(String args[]){
        int[] arr = {5, 3, 2, 3, 5};
        Unique(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Unique(int[] arr){
        int n = arr.length;
        int i = 0;
        int ans = n;
        int j = n - 1;
        while(i <= j){
            if(arr[i] != arr[j]){
                System.out.println(ans);
            }
            
        }
        
    }
    
}
