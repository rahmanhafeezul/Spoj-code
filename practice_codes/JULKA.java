import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class JULKA
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=10;
        while(a>0)
        {String x=s.next();
       String y=s.next();
        calcu(x,y);
            a--;
        }
    }
    public static void calcu(String x,String y)
    {
        //System.out.println(x+" "+y);
        BigInteger a=new BigInteger(x);
        BigInteger b=new BigInteger(y);
        System.out.println((a.add(b)).divide(new BigInteger("2")));
                System.out.println((a.subtract(b)).divide(new BigInteger("2")));

        
    }
            }
