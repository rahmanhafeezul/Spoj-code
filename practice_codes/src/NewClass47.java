import java.io.*;
import java.util.*;
public class NewClass47 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(c>a && c>b) 
                System.out.println(-1);
            
            t--;
        }
    }
    
}
