import java.util.*;
class LinearSearch1{
    public static void main(String[] args){
        int[] arr = {1, 4, 5, 4, 8, 9};
        findAll(arr, 4, 0);
        System.out.println(list);
      //  System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
      ArrayList<Integer> ans = findAllIndex(arr, 4, 0, new ArrayList<>());
      System.out.println(ans);
        

    }
    static ArrayList<Integer> list = new ArrayList<>(); 
    static void findAll(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAll(arr, target, index + 1);
    }
    // VARIABLE INSIDE THE PARAMETER VS VARIABLE AND OBJECT INSIDE THE BODY
    // ANS :- VARIABLE INSIDE THE PARAMETER PASS TO A FUNCTION CALLS 
    // && VARIABLE INSIDE THE BODY IT REMAIN FOR THAT BODY 

    // second way if you want array list inside 
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
         return   findAllIndex(arr, target, index + 1, list);
    } 
}