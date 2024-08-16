class A{
    int i;
}

class B extends A{
    int i;

    B(int a,int b){
        
        super.i = a; // i in A
        i = b; // i in B
    }

    void show(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
class Super{
    public static void main(String args[]){
        B subObj = new B(5, 10);
        subObj.show();
    }
}