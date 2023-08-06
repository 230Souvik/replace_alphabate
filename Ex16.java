
package ex16;
import java.util.*;

public class Ex16 {
public void replace(String str,char ch1,char ch2){
     String res = "";
for (int i = 0; i < str.length (); i++)
{
if (str.charAt (i) == ch1)
res = res + ch2;
else if (str.charAt (i) == ch2)
res = res + ch1;
else
res = res + str.charAt (i);
}
System.out.println ("Afer replace:-  "+res);
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ex16 e=new Ex16();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any word");
        String s=sc.next();
        System.out.println("enter alphabet which are replace");
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        e.replace(s,ch1,ch2);
    }
    
}
