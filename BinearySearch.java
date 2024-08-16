class BinearySearch{
    public static void main(String[] args){
        int arr[] = {-18, -15, -10, -5, -3, 0, 1, 4, 7, 9, 15};
        int target = 22;
        int ans = BinearySearch(arr, target);
        System.out.println(ans);
    }
    static int BinearySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}