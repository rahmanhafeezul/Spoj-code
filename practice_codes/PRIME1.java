import java.io.*;
import java.util.*;
public class PRIME1
{
    public static void main(String[] args)throws IOException
    {
        Scanner s=new Scanner(System.in);
     try{   int n=s.nextInt();
        while(n>0)
        {int a=s.nextInt();
        int b=s.nextInt();
            prime(a,b);
            //System.out.println("\n");
            n--;
        }}
     catch(Exception e)
     {
         return;
     }
    }
    public static void prime(int x,int y)
    {
                            boolean[] isPrime = new boolean[y + 1];
                            for (int i = 2; i <= y; i++) {
            isPrime[i] = true;
        }
for (int i = 2; i*i <= y; i++) {

            
            if (isPrime[i]) {
                for (int j = i; i*j <= y; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
for (int i = x; i <= y; i++) {
            if (isPrime[i]) 
            {System.out.print(i+"\n");
        }
    }System.out.print("\n");
}
}