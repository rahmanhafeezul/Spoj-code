import java.io.*;
import java.util.*;
        
public class NewClass22 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] ans=new int[n][m];
        for(int i=0;i<m;i++)
        {
            ans[0][i]=arr[0][i];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==0 && m!=1)
                    ans[i][j]=Math.min(ans[i-1][j], ans[i-1][j+1])+arr[i][j];
                else if(j==0 && m==1)
                    ans[i][j]=ans[i-1][j]+arr[i][j];
                else if(j==m-1 && m!=1)
                    ans[i][j]=Math.min(ans[i-1][j], ans[i-1][j-1])+arr[i][j];
                else 
                    ans[i][j]=Math.min(ans[i-1][j], Math.min(ans[i-1][j-1],ans[i-1][j+1] ))+arr[i][j];
            }
        }
        int min=ans[n-1][0];
        for(int i=0;i<m;i++)
        {min=Math.min(min, ans[n-1][i]);
            
        }
        System.out.println(min);
    }
    
}
