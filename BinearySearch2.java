
class BinearySearch {
    public static void main(String[] args){
        int[] arr = {-18, -15, -12, -10, -7, -4, -1, 1, 5, 7, 9, 13, 15};
        int target = 7;
        int ans = BinearySea(arr, target);
        System.out.println(ans);

    }
    static int BinearySea(int[]  arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = (arr[start] < arr[end]);
      /*  if(arr[start] < arr[end]){
            isAsc =true;
        }
        else {
            isAsc = false;
        } */

        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }

            }
            else {
                if (target > arr[mid]) {
                end = mid - 1;
            }
            else if(target < arr[mid]){
                start  = mid + 1;
            }
            
            }
            

            
        }
        return -1;
    }
}