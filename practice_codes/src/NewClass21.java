import java.io.*;
import java.util.*;

public class NewClass21 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int size=sc.nextInt();
            int[][] arr=new int[size][size];
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            int[][] ans=new int[size][size];
            ans[0][0]=arr[0][0];
            for(int i=1;i<size;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    if(j==0)
                        ans[i][j]=ans[i-1][j]+arr[i][j];
                    
                    else if(j==i)
                        ans[i][j]=ans[i-1][j-1]+arr[i][j];
                    else
                        ans[i][j]=Math.max(ans[i-1][j]+arr[i][j],ans[i-1][j-1]+arr[i][j]);
                }
            }
            int max=ans[size-1][0];
            for(int j=0;j<size;j++)
            {max=Math.max(max,ans[size-1][j]);
                
            }
            System.out.println(max);
            n--;
        }
    }
            
    
}
