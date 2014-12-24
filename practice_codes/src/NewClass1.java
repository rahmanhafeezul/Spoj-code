import java.io.*;
import java.util.*;
public class NewClass1 {
    public static void main(String[] args)throws IOException
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      while(n>0)
      {
          long ans=0;
          long a=sc.nextLong();
          if(a==0)
              ans=0;
          else if(a==1)
              ans=1;
          else
                ans=((a*(3*a+1))/2)%1000007;
          System.out.println(ans);
          n--;
      }
    }
    
}
