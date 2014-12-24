import java.io.*;
import java.util.*;
public class NewClass19 {
    public static void main(String[] args)throws IOException
    {Scanner sc=new Scanner(System.in);
        int n[]=new int[sc.nextInt()];
        for(int i=0;i<n.length;i++)
        {
            n[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        while(t>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==1)
            {
              int curr_sum=n[b-1];
              int max_sum=n[b-1];
              for(int i=b;i<=c-1;i++)
              {
                  curr_sum=Math.max(n[i], n[i]+curr_sum);
                  max_sum=Math.max(curr_sum,max_sum);
                  
              }
              System.out.println(max_sum);
            }
            else
            {
               n[b-1]=c; 
            }
            t--;
        }
        
    }
    
}
