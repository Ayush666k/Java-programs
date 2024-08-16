class Constructor{
    public static void main(String[] args){
        student Naruto = new student();
        student Sasuke = new student();
        System.out.println(Naruto.rno);
        System.out.println(Naruto.name);
        System.out.println(Naruto.mark);
        Naruto.greeting();
        Naruto.changeName("Uzumaki Boruto");
        Naruto.greeting();
        

    }
}
class student{
    int rno;
    String name;
    float mark = 9.5f ;

    void greeting(){
        System.out.println("My name is " + this.name);
    }
void changeName(String newName){
    name = newName;
}

    student(){
        this.rno = 13;
        this.name = "Uzumaki Naruto";
        this.mark = 85.67f;
    }

}