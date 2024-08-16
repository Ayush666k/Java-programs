class While{
    public static void main(String[] ars){
        int count = 1;
        System.out.println("printing first 10 odd number");
        while(count < 11){
            System.out.print(" " + (2*count - 1));
            count++;
        }
    }
}