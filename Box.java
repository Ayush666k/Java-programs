class Box{
    double l;
    double h;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;

    }

    Box(double i, double h, double w){
        this.h = h;
     //   this.l = l;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    public void information(){
        System.out.println("Running the box");
    
    }
    public static void main(String[] args){
        Box box = new Box(4);
        System.out.println(box.l + " " + box.w + " " + box.h);
    }
    
}