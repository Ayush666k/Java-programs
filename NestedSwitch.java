import java.util.*;
class NestedSwitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int EmpId = in.nextInt();
        String Department = in.next();
         switch (EmpId){
            case 1 :
            System.out.println("Naruto Umumaki");
            break;
            case 2 :
            System.out.println("Sasuke Uchicha");
            break;
            case 3 :
            switch (Department){
                case "IT" :
                System.out.println("IT Department");
                break;
                case "Management" :
                System.out.println("Management Department");
                break;
                default :
                System.out.println("Department no Exits");
                break;
            }
            default :
            System.out.println("Enter Correct EmpID");

         } 

    }
}