class Recursion{
    public static void main(String[] args){
        print1(1);

    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print3(4);
    }
    static void print4(int n){
        System.out.println(n);
        print3(5);
    }
    static void print5(int n){
        System.out.println(n);
        
    }
}