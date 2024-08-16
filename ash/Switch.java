package ash;
public class Switch {
    public static void main(String args[]){
        int i = 1, j = 0;
        switch(i){
            case 0 : j += 1;
            default : j += 2;
            case 1 : j += 5;
            case 3 : j += 6;
            //case 2 : j += 4;
        }
        System.out.println("j = " + j );

    }
    
}
