class Continue{
    public static void main(String[] args){
        for(int count = 0; count <= 11; count++){
            System.out.print(count);
            if(count % 3 == 0) continue;
            System.out.println(" ");
            
            
        }
    }
}