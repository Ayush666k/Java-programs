class Point{ 
    int x, y;
    void setpoint(int a, int b){
        x = a;
        y = b;
    }
}
class Nptl4 {
    public static void main(String[] args){
        Point p = new Point();
        p.setpoint(15, 20);
        System.out.println("x: " + p.x);
        System.out.println("y: " + p.y);
    }
}