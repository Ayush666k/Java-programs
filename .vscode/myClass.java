import java.io.*;
public class myClass {
   
    public static void main(String[] args) throws Exception {
        System.out.println("File handling in java");
      //  File file = new File("abc.txt");
    //    file.createNewFile();
    //    System.out.println(file.exists());
        FileWriter fw = new FileWriter("abc.txt");
       //  wr.write("My name is Sasuke Uchiha");
       //  wr.close();
       //  FileReader fr = new FileReader(file);
       //  System.out.println(fr.read());
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write("I am Naruto uzumaki");
       bw.close();
       FileReader fr = new FileReader("abc.txt");
       BufferedReader br = new BufferedReader(fr);
       System.out.println(br.readLine());

    } 
    
}
