class Pattern5{
    public static void main(String[] args){
        pattern(4);

    }
    static void pattern(int n){
        for(int i = 1; i < 2 * n; i++){ 
            int totalColsInRow = i > n ? 2 * n - i : i;
            for(int j = 0; j < totalColsInRow; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}