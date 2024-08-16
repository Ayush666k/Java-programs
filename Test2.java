import java.util.*;
class Test2{
   
    public static void main(String[] args){
        System.out.print("Please enter the some input: ");
        Scanner input = new Scanner(System.in);
        int rollno =  input.nextInt();
        System.out.println("Your roll number is " + rollno);
        String name = input.next();
        System.out.println(name);
        float marks = input.float();
        System.out.println(marks);
    }
}