import java.io.*;
import java.util.*;
public class NewClass39 {
    public static void main(String[] args)throws IOException
    {
       Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();int gf=m;
        int n=sc.nextInt();
        //consider p=1, t=0 in the 2-D array
        int arr[][]=new int[m][n];int i=0;int g=0;
        while(m>0)//m is the rows, n is the colums
        {
            String s=sc.next();
            for(int fd=0;fd<s.length();fd++)
            {if(s.charAt(fd)=='P')
                arr[g][fd]=1;
            else
                arr[g][fd]=0;}
            
            m--;g++;
        }
        for(int h=0;h<gf;h++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(arr[h][j]);
            }
        }
        Vector h=combine(0,n);
        for(int ig=0;ig<h.size();ig++){
        System.out.println(h.elementAt(ig));
        }
        
    }
   public static Vector combine(int start,int n)
   {StringBuilder s=new StringBuilder();
   Vector v=new Vector();
       for(int i=start;i<n;i++)
       {
           s.append(Integer.toString(i));
            v.add(s.toString());
           if(i<n)
           {
             combine(i+1,n);  
           }
           s.setLength(s.length()-1);
       }return v;
   }

}
