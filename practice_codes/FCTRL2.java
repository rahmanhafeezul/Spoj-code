import java.math.BigInteger;
import java.util.*;
public class FCTRL2
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in)
               ;
        int n=s.nextInt();
        while(n>0)
        {System.out.println(fact(s.nextInt()));
            n--;
        }
    }
    public static String fact(int k)
    {
        BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= k; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact.toString();
        }
    }
