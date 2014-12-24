import java.io.*;
import java.util.*;

public class NewClass5 {
    public static void main(String[] args)throws IOException
    {Set h1 = new HashSet();
    Set h2=new HashSet();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {h2.add(sc.nextInt());
        int a=sc.nextInt();
        while(a>0)
        {
            h1.add(sc.nextInt());
         a--;   
        }
         n--;   
        }
     h1.removeAll(h2);
     System.out.println(h1.size());
    }
    
}
