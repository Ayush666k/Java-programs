//package heaps;
import java.util.*;
public class heapMain {
    public static void main(String args[])throws Exception{
        heap<Integer> h = new heap<>();
    
        h.insert(34);
        h.insert(23);
        h.insert(35);
        h.insert(45);
    
        h.insert(76);
    
        h.insert(89);
        h.insert(9);
    
        try {
            System.out.println(h.remove());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        ArrayList list = h.heapSort();

        System.out.println(list);
    
    
    }
    
}
