import java.util.Scanner;

public class sunCnt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        String[] arr = {"mon", "tue", "wes", "thu", "sat", "sun"};
        int i;
        for(i = 0; i < n; i++){
            if(arr[i].equals(str)) break;
            int res = 1; int rem = i - 1; n = n - rem;
            if(n > 0){
                res += n/7;
                
            }
            System.out.println(res);
            
        }
    }
    
}
