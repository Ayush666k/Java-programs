class DoWhile{
    public static void main(String[] args){
        int count = 2;
        System.out.println("Printing first 10 even number");
        do{
            System.out.print(" " + 2 * count);
            count++;
        }
        while (count < 11);
    }
}