class Occurence {
    public static void main(String[] args){
        int n = 1353473;
        int Count = 0;
        
        while(n > 0){
           int rem = n % 10;
            if(rem == 3){
        Count++;
            }
            n = n / 10;
        
        }

        System.out.println(Count);
        
    }
}