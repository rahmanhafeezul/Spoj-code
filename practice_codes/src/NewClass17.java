import java.io.*;
import java.util.*;
public class NewClass17 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int e, f, s, m, e1,f1, s1, m1;
        while(true)
        {
        e=sc.nextInt();
        if(e==-1)
            break;
        f=sc.nextInt();
        s=sc.nextInt();
        m=sc.nextInt();
        e1=sc.nextInt();
        f1=sc.nextInt();
        s1=sc.nextInt();
        m1=sc.nextInt();
        if(e==0 && e==f &&  f==s && s==m)
            System.out.println("0 0 0 0");
       else
        {double max1=Math.max(e/e1,Math.max(f/f1,Math.max(s/s1,m/m1)));
       
      int max2=(int)Math.ceil(max1);
        System.out.println((e1*max2-e)+" "+(f1*max2-f)+" "+(s1*max2-s)+" "+(m1*max2-m));
        }
        }
    }
    
}
