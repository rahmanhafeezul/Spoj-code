import java.io.*;
import java.util.*;
public class NewClass16 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int p[];int val[];
        while(n>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int W=b-a;
            int t=sc.nextInt();
            p=new int[t];
            val=new int[t];int k=0;
            while(t>0)
            {
               val[k]=sc.nextInt();
               p[k]=sc.nextInt();
               k++;
                t--;
            }
            int[][]  soln=new int[val.length+1][W+1];
            for(int i=0;i<=val.length;i++ )
            {
                soln[i][0]=0;
            }
            for(int i=0;i<=W;i++)
            {
                soln[0][i]=0x7fffffff;
            }
            for(int i=1;i<=val.length;i++)
            {
                for(int w=1;w<=W;w++)
                {
                    if(p[i-1]>w)
                        soln[i][w]=soln[i-1][w];
                    else
                        soln[i][w]=Math.min(soln[i-1][w], val[i-1]+soln[i][w-p[i-1]]);
                }
            }
            int gh=soln[val.length][W];
            if(gh<0)
                
            System.out.println("This is impossible.");
            else
                System.out.println("The minimum amount of money in the piggy-bank is "+gh+".");
            
            
            
            
            
            
            n--;
        }
    }
    
}
