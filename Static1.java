public class Static1{
    static int a = 4;
    static int b;

// will only runs once, when the first obj is created i.e. loaded first time
    static {
        System.out.println("I am in static block");
        b = a * 5;

    }
    public static void main(String[] args){
        Static1 obj = new Static1();
        System.out.println(Static1.a + " " + Static1.b);

        Static1.b += 3;
        System.out.println(Static1.a + " " + Static1.b);

        Static1 obj2 = new Static1();
        System.out.println(Static1.a + " " + Static1.b);


    }
}