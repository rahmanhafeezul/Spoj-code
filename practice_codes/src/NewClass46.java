import java.io.*;
import java.util.*;
public class NewClass46 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(((n-k)&((k-1)/2))==0)
                System.out.println(1);
            else
                System.out.println(0);
            
            t--;
        }
    }
    
}
