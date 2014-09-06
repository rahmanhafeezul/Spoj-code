import java.io.*;
import java.util.*;
public class ACPC10A
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        while(true)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            if((a==b)&&(b==c))
                    {
                        break;
                    }
            else
            {
                calc(a,b,c);
            }
        }
    }
    public static void calc(int x,int y,int z)
    {
        if((y-x)==(z-y))
        {
            System.out.println("AP"+" "+(z+z-y));
        }
        else
        {double s=(z*y/x);
            System.out.println("GP"+" "+(int)s);
        }
    }
}