import java.io.*;
import java.util.*;
public class ADDREV
{
    public static void main(String[] args)throws IOException
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println(reverse(reverse(a)+reverse(b)));
            n--;
        }
        
    }
    public static int reverse(int f)
    {int rev=0;
        while(f>0)
    {
        
        int a=f%10;
        rev=rev*10+a;
        f=f/10;
        
    }   return rev;
    }
}