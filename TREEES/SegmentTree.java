package TREEES;

public class SegmentTree {

    public static void main(String args[]){
        SegmentTree tree = new SegmentTree();

        int[] nums = {};
        
    }

    public static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;
    }

    public Node(int data){
        this.data = data;
    }

    public int getValue(){
        return data;
    }

    private Node root;

    public Node(){

    }

    public int startInterval(int start, int end){
        if(start == end){
            return data;
        }
        this.data;
        int mid = (start + end) / 2;
        return Node;

        
    }
    public int endInterval(int start, int end){
        if(start == end){
            return data;
        }
        
    }

    return 
}
