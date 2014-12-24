import java.io.*;
import java.util.*;

public class NewClass63 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            System.out.println(f(n,1));
            t--;
        }
    }
    public static long f(int n, int k)
    {
        
        if(n==1)
            return 1;
        else
            return (f(n-1,k+1)+k-1)%n+1;
    }
            
    
}
