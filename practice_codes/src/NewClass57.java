import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class NewClass57 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {br.readLine();
        String arr[]=br.readLine().split(" ");
        
            int n=Integer.parseInt(arr[0]);int k=Integer.parseInt(arr[1]);
            
            
            int flag=0;
            BigInteger b1=new BigInteger("2");BigInteger b3=new BigInteger("1");
            BigInteger b2=BigInteger.valueOf(k);
            BigInteger b;
            b = (b1.pow(n-1)).add(b2).subtract(b1);
            //System.out.println(b+" b");
            if(b.equals(new BigInteger("0")))
            {
                System.out.println("Male");
            }
            else{     while (!(b.equals(b1)|| b.equals(b3)))
            {
                if(!b.mod(b1).equals(b3))
                {
                    b=b.divide(b1).subtract(b3);
                    flag=(flag+1)%2;
                }
                else
                {
                    b=b.divide(b1);
                    //System.out.println(b+" b in process");
                }
            }
            //System.out.println(b+" "+flag);
            if(flag==0 && b.equals(b1))
            {
                System.out.println("Female");
            }
           else if(flag==0 && b.equals(b3))
            {
                System.out.println("Male");
            }
           else if(flag==1 && b.equals(b3))
           {
               System.out.println("Female");
           }
            else
           {
              System.out.println("Male"); 
           }}
            t--;
        }
    }
    
}
