import java.io.*;
import java.util.*;
public class NewClass3 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int k=n;
        Vector v=new Vector();
        while(k>0)
        {
            
            v.add(sc.nextInt());
          k--;  
        }
        for(int i=0;i<v.size();i++)
        {
            System.out.println(v.elementAt(i));
        }
        int[][] val=new int[n][n];
        int[][] T=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                val[i][j]=n-j+i;
            }
        }
        for(int i=0;i<n;i++)
        {
            T[i][i]=(int)v.elementAt(i)* n;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                T[i][j]=Math.max(T[i+1][j]+(int)v.elementAt(i)*val[i][j],T[i][j-1]+(int)v.elementAt(i)*val[i][j]);
            }
        }
//        for(int i=0;i<n;i++)
//        {
//            for(int j=i;j<n;j++)
//            {
//                System.out.println(T[i][j]);
//            }
//        }
        System.out.println(T[0][n-1]);
        
    }
    
}
