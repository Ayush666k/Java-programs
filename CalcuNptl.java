import java.lang.*;
class Calculator{
        double i;
        double x = i * i;
    }
class CalcuNptl{
    public static void main(String args[]){
        Calculator a = new Calculator();
        a.i = 20;
        
        System.out.println("Square root of "+a.i+ " is " +a.x);

    }
    
}