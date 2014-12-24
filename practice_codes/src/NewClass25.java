import java.io.*;
import java.util.*;
public class NewClass25 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int l=sc.nextInt();
        int m=sc.nextInt();
        int[] inp=new int[m];int max=0;
        for(int i=0;i<m;i++)
        {
            inp[i]=sc.nextInt();
            max=Math.max(max,inp[i]);
        }
        boolean[] dp=new boolean[max+1];
        dp[0]=false;
        int gh=Math.max(k,l);
        for(int i=0;i<max-gh+1;i++)
        {
            if (dp[i]==false)
            {
                dp[i+1]=true;
                dp[i+k]=true;
                dp[i+l]=true;
            }
            else
            {
                dp[i+1]=false;
                dp[i+k]=false;
                dp[i+l]=false;
              
            }
        }
        String s="";
        for(int i=0;i<inp.length;i++)
        {if(dp[inp[i]]==true)
            s+="A";
        else
            s+="B";
        }
        System.out.println(s);
    }
    
}
