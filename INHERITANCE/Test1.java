class A{
    int i, j;
    void showij(){
        System.out.println("i and j: " + i + " " + j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("i + j + k " + (i + j + k));
    }

}
class Test1{
    public static void main(String args[]){
        A superObj = new A();
        B subObj = new B();
        // super class may be used itself.
        superObj.i = 10;
        superObj.j = 20;
        System.out.println("Content of superObj: ");
        superObj.showij();
        System.out.println();

        // The subclass has access to all public member of its superclass
        subObj.i = 7;
        subObj.j = 8;
        subObj.k = 9;
        System.out.println("Content in subObj: ");
        subObj.showij();
        subObj.showk();
        System.out.println();
        System.out.println("The sum of i, j and k in subOBj: ");
        subObj.sum(); 
        
    }
}