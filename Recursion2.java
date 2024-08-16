class Recursion2{
    public static void main(String[] args){
        print(1);

    }
    static void print(int n){
        System.out.println(n);
        print(2);
    }
}