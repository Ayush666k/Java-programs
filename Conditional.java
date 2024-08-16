class Conditional{
    public static void main(String args[]){
        int salary = 200;
        if(salary > 10000){
            salary = salary + 2000;

        }
        else if (salary < 10000){
            salary = salary + 1000;

        }
        else{
            salary += 500;
        }
        System.out.println(salary);
        
    }
}