import java.util.*;
class Switchcase{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit){
            case "Mango":
            System.out.println("Mango is king");
            break;
            case "Apple":
            System.out.println("Apple is sweet food");
            break;
            case "Banana":
            System.out.println("Banana is healthy");
            break;
            default : 
            System.out.println("Enter valid fruit");
        }
    }
}