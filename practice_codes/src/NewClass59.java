import java.io.*;
import java.util.*;
public class NewClass59 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n==0)
            System.out.println(1);
        else
        {int[][] l=new int [n+1][3];
        for(int i=0;i<3;i++)
        {
            
                l[1][i]=1;
            
        }
        //System.out.println(l[1][0]+" "+l[1][1]+" "+l[2][0]);
        for(int i=2;i<=n;i++)
        {
            l[i][0]=l[i-1][0]+l[i-1][1];
            l[i][1]=l[i-1][0]+l[i-1][2]+l[i-1][1];
            l[i][2]=l[i-1][2]+l[i-1][1];
        }
        System.out.println(l[n][0]+l[n][1]+l[n][2]);
        }
    }
    
}
