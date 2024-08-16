class RecFibo{
    int n;
    int fibo(int n){
        if (n == 0)
           return 0;
           else if (n == 1)
           return 1;
                   else
                       return(fibo(n - 1) + fibo(n - 2));
    }
    public static void main(String args[]){
        RecFibo  obj = new RecFibo();
        obj.n = Integer.parseInt(args[0]);
        for(int i = 0; i <= obj.n; i++){
            System.out.println(obj.fibo(i));
        }

    }
}