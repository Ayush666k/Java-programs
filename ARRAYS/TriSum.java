//package ARRAYS;
import java.util.*;
public class TriSum {

    static int triple(int[] arr, int target){
        int ans = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length - 1; j++){
                for(int k = j+1; k <arr.length - 1; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    } 
                }
            }
        }
        return ++ans;


    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " element");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter target sum ");
        int target = sc.nextInt();

        System.out.println(triple(arr, target));
    }
    
}
