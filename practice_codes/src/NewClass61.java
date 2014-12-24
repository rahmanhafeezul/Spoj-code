import java.io.*;
import java.util.*;
public class NewClass61 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];int i=0;int max=0;int index =0;
            while(n>0)
            { a[i]=sc.nextInt();
            if(a[i]>max)
            {
                max=a[i];
                index=i;
            }
             b[i++]=sc.nextInt();
                
                n--;
            }
            
            int flag=0;
            for(int j=0;j<a.length;j++)
            {if(index!=j){
                if(max>b[j])
                {continue;}
                else
                {
                  flag=1;
                  break;
                }}
                    
            }
            if(flag==1)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(index+1);
            }t--;
        }
    }
    
}
