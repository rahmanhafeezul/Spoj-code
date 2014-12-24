import java.util.*;
import java.io.*;

public class NewClass4 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int flag=0;
            int a=sc.nextInt();
            
            int[] v=new int[2001];
            for(int i=0;i<2001;i++)
            {
                v[i]=0;
            }
            for(int i=0;i<a;i++)
            {int g=sc.nextInt();
               v[g+1000]+=1;
               
            }
            int current=0;
            for(int i=0;i<2001;i++)
            {
               if(v[i]>v[current])
                   current=i;
            }
            if(v[current]>a/2)
            {
                
               System.out.println("YES "+(current-1000));
               
            }
            else
                System.out.println("NO");
                n--;
        }
    }
    
}
