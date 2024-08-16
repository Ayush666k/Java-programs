class Strings {
    public static void main(String[] args){
        // in a ref variable a and b, pointng to same object it was store heap in the pools so 
        // that was a and b pointing to the same object, it cant be change
        String a = "Sasuke";

        String b = "Sasuke";
        System.out.println(a == b);
    }
}