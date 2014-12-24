import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class NewClass11 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==b&&a==0)
                break;
            else
            {
                
                System.out.println(BigInteger.valueOf(a).pow(b));}
        }
    }
    
}
