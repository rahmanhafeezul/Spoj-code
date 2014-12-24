import java.io.*;
import java.util.*;
public class NewClass33
        {
 public static void main(String[] args)throws IOException
 {
     Scanner sc=new Scanner(System.in);
     long k=1;
     boolean[] check=new boolean[21];
     //System.out.println("lcm="+gcd(2,3));
     while(true)
     {
         String s=sc.next();
        if(s=="*")
            break;
        else
        {
            for(int i=0;i<s.length();i++)
            {long a=i+1;
           if(s.charAt(i)=='Y')
           {//System.out.println("k=="+k+"A=="+a);
           k=lcm(k,a);}
           else
              check[i]=true; 
                
            }//System.out.println("k="+k);
            for(int i=0;i<check.length;i++)
            {
                if(check[i]==true)
                {
                    if(k%(i+1)==0)
                        k=-1;
                }
            }
        }
        System.out.println(k);
     }
     
     
 }

    

    private static long gcd(long a, long b) {
        if(a<b)
            return gcd(b,a);
        if(b==0)
                return a;
        else    
                return gcd(b,a%b);
                
    }
    private static long lcm(long k, long a) {
     
        return((k*a)/gcd(k,a));
    }
}
