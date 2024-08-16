class A{
    public void msg1(){
        System.out.println("Class A: public");
    }

    private void msg2(){
        System.out.println("Class A: private");
    }

    protected void msg3(){
        System.out.println("Class A: protected");
    }
}
public class AMOverriding extends A{
    void msg(){
        System.out.println("Class main: Welcome!");
    }
    public void msg1(){ // if modifier set to defaults it cannot override.
        System.out.println("Overriding public Method!");
    }
     void msg2(){
        System.out.println("Overriding private method");
    }
    // if modifier set to be private it can be overriden.
    public void msg3(){
        System.out.println("Overriding protected method");
    }

    public static void main(String args[]){
        AMOverriding obj = new AMOverriding();
        obj.msg();
        obj.msg1();
        obj.msg2();
        obj.msg3();
    }
}