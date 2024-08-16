import java.util.*;
public class changeCase {
    
    
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isUpperCase(c))
            {
                String s=String.valueOf(c);
                String h=s.toLowerCase();
                str1=str1+h;
            }
            else{
                String v=String.valueOf(c);
                String j=v.toUpperCase();
                str1=str1+j;
            }
        }
        System.out.print(str1);
        }
    
    
}
