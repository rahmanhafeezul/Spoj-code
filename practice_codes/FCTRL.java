import java.io.IOException;
import java.util.*;
public class FCTRL
{
    public static void main(String[] args)throws IOException
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      while(n>0)
      {
          System.out.println(zeros(s.nextInt()));
          n--;
      }
    }
    public static int zeros(int f)
    {int s=0;
        while(f>0)
        {s+=f/5;
       f=f/5;
            
        }
        return s;
    }
}