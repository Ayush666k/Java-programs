class Cat {
    void speak(){
        System.out.println("meaon !");
    }
}
class petCat extends Cat{
    void speak(){
        System.out.println("meaon !");
    }
}
class magicCat extends Cat{
    static boolean noOne;
    void speak(){
        if(noOne){
            super.speak();
        }
        else {
            System.out.println(" Hello World");
        }
    }
}
class Share{
    public static void main(String args[]){
        petCat c1 = new petCat();
        magicCat c2 = new magicCat();
        c2.noOne = true;
        c2.speak();
        c1.speak();
        c2.noOne = false;
        c2.speak();
    }

}