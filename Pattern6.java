class Pattern6{
    public static void main(String[] args){
        pattern(4);

    }
    static void pattern(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpace = n - totalColsInRow;
            for(int s = 0; s < noOfSpace; s++){
                System.out.print(" ");
            }
            for(int col = 0; col < totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}