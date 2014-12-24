import java.io.*;
import java.util.*;
public class NewClass53 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();int c1=0;int c2=0;
            while(n>0)
            {
                String f=sc.next();
                if("lxh".equals(f))
                {
                    c1++;
                }
                n--;
            }
            if(c1%2==0)
            {
                System.out.println("hhb");
            }
            else
            {
                System.out.println("lxh");
            }
            t--;
            
        }
    }
    
}
