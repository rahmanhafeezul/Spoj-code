import java.io.*;
import java.util.*;
public class New
{
    public static void main(String[ ] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int flag=-1;int count=0;
        while(true)
        {int sum=0;count++;
        while(n>0)
        {int a=n%10;
           sum+=a*a;
           n=n/10;
           
        }
        n=sum;
        if(sum==1)
        {flag=count;break;}
        else if(sum>1 && sum<10)
        {
            break;}
        else
            continue;
        }
         System.out.println(flag);
    }
}