import java.util.*;

class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) {
            int arr[] = new int[5];
            arr[0] = 23;
            arr[1] = 45;
            arr[2] = 69;
            arr[3] = 678;
            arr[4] = 690;
             System.out.println(arr[3]);
             for (int i = 0; i < arr.length; i++) {
                 arr[i] = input.nextInt();

             }
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "  ");
            }

        }
    }
}