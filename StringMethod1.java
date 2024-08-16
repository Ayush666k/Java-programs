class StringMethod1{
    public static void main(String[]  args){
        String personalised = myGreet("Sasuke");
        String personalised1 = greet();
        System.out.println(personalised);
        System.out.print(personalised1); 

    }
    static String myGreet(String name){
        String Message = "Hi "+name;
        return(Message);
    }
    static String greet() {
        String greeting = "Just like i care";
        return(greeting);
    }
}