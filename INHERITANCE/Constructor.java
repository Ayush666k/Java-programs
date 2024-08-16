class Box{
    double width;
    double height;
    double depth;

    Box(){    // Default setting by this constructor
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }
}
class BoxWeight extends Box{
    double weight;
    // constructor
    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;

    }
}
class Constructor{
    public static void main(String args[]){
        Box myBox1 = new Box(10, 20, 30);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = myBox1.volume();
        System.out.println("Volume of my box: " + vol);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is: " +vol);
        System.out.println("Weigth of myBox2 is: " + myBox2.weight);
    }
}