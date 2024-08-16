class A{
    void m() {
        System.out.println("Hello Naruto");

    }
    void n(){
        System.out.println("Hello Sasuke");
        this.m();
    }
}
class nptl5 {
    public static void main(String[] args){
        A a = new A();
        a.n();
}
}