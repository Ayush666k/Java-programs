import java.util.*;
public class Nrep {

    static int Norepeat(int[] arr){
        int ans = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length - 1; j++){
                    if(arr[i] != arr[j]){
                        ans++;
                    } 
                }
            }
        
        return ans;


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
        
    

        System.out.println(Norepeat(arr));
    }
    
}
