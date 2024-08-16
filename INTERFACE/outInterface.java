import java.net.SocketPermission;
import java.net.SocketTimeoutException;

import INTERFACE.*;

class  outInterface implements myInterface   {
    public void display()
    {
        System.out.println("Fine!");
    }

    public static void main(String args[]){
        outInterface t = new outInterface();
        t.display();
        System.out.println("The final value of myInterface " + a);
    }
    
}