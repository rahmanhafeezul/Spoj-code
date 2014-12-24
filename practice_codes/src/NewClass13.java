import java.io.*;
import java.util.*;
public class NewClass13 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);int v[];int p[];
        while(true)
        {
            int W=sc.nextInt();//initial money
            int b=sc.nextInt();//total number of parties
            if(W==b && W==0)
                break;
            else
            {v=new int[b];p=new int[b];
                while(b>0)
                {int a=b-1;
                    p[a]=sc.nextInt();
                v[a]=sc.nextInt();
                    b--;
                }
            }

            int[][]  soln=new int[v.length+1][W+1];
            for(int i=0;i<=v.length;i++ )
            {
                soln[i][0]=0;
            }
            for(int i=0;i<=W;i++)
            {
                soln[0][i]=0;
            }
            for(int i=1;i<=v.length;i++)
            {
                for(int w=1;w<=W;w++)
                {
                    if(p[i-1]>w)
                        soln[i][w]=soln[i-1][w];
                    else
                        soln[i][w]=Math.max(soln[i-1][w], v[i-1]+soln[i-1][w-p[i-1]]);
                }
            }

            int xs=soln[v.length][W];int xy=W;
            for(int h=W;h>=0;h--)
            {
                if((soln[v.length][h]==xs)&& h<W)
                    xy=h;
            }
            
            System.out.println(xy+" "+xs);
        }
    }
    
}
