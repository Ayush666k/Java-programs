import java.util.*;
class ArrayList1{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(67);
        list.add(456);
        list.add(765);
        list.add(879);
        list.add(6969);
        list.add(675);

        System.out.println(list.contains(6969));

        System.out.println(list);

    }
}