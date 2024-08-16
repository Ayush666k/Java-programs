
     public class QuickSort{
     int partition(int[] arr, int start, int end){
        int pivot  = arr[end];
        int i = (start - 1);
        for(int j = start; j <= end - 1; j++){
            if (arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return( i + 1);

    }
    void quick(int arr[], int start, int end){
        if(start < end){
            int p = partition(arr, start, end);
            quick(arr, start, p - 1);
            quick(arr, p + 1, end);
        }
    }
    void printarr(int arr[], int n){
        int i;
        for(i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }
    
    public static void main(String[] args){
        int [] arr = {5, 4, 2, 3, 1};
        int n = arr.length;
        System.out.println("before sorting array element are: ");
        QuickSort q1 = new QuickSort();
        q1.printarr(arr, n);
        q1.quick(arr, 0, n - 1);
        System.out.println("After sorting element array: ");
        q1.printarr(arr, n);
        System.out.println();
      }
}