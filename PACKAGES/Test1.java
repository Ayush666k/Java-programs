

class Calculator{
    double i;
    double x;
    void p(){
        x = Math.sqrt(i);

    }
}

class Test1{
    public static void main(String args[]){
        Calculator a = new Calculator();
        a.i =  20.0;
        a.p();
        System.out.println("The Square root of"+ a.i + " is " + a.x);
    }
}