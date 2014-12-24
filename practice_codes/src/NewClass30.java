import java.io.*;
import java.util.*;
public class NewClass30 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int r=sc.nextInt();
            int f=sc.nextInt();
            int x=10;
           System.out.println(++x);
            System.out.println(((f-n)/(k-1))*k+n);
            t--;
        }
    }
    
}
