import java.io.*;
import java.util.*;
public class NewClass50 {
    
 public static void main(String[] args)throws IOException
 {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
       
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {
            long n=Long.parseLong(br.readLine());long s=(long)Math.floor(n/2);
            while(true)
            {if(n==1 && n==0)
                break;
                 
                if(gcd(n,s)==1)
                    break;
                else
                    s=s-1;
                
            }System.out.println(s);
            t--;
        }
    }

    private static long gcd(long n, long s) {
        if(s>n)
            return gcd(s,n);
        else if(s==0)
            return n;
        else
            return gcd(s,n%s);
    }
    

}




