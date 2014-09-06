import java.io.*;
import java.util.*;
public class SAMER08F
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        while(true)
        {
            int a=s.nextInt();
            if(a!=0)
                calc(a);
            else 
                break;
        }
        
    }
    public static void calc(int x)
    {
        
  System.out.println((x*(x+1)*(2*x+1))/6);
    }
}