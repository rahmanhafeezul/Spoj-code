import java.util.*;
import java.io.*;
public class TOANDFRO
{
    public static void main(String[] args)throws IOException
    {
        Scanner s=new Scanner(System.in);
        while(true)
        {
            int a=s.nextInt();
            if(a==0)
            {break;}
            else {}
                String b=s.next();
                calc(b,a);
                //System.out.println(b);
        }
    }
    public static void calc(String f,int a)
    {String g="";
        for(int i=a,j=1,k=0;i< f.length() || (k+a)<=f.length();j++,k=k+a)
        {
            if(j%2==1)
            {
              g+=f.substring(k, k+a);//System.out.println(f.substring(k, k+a)+" "+k+" hi");
            }
            else 
            {
                g+=new StringBuffer(f.substring(i,i+a)).reverse().toString();
                //System.out.println(new StringBuffer(f.substring(i,i+a)).reverse().toString()+ i +" hello");
                i=i+2*a;
            }
        }        

        finale(g,a);
    }
    public static void finale(String h,int q)
    {String g="";
    for(int j=0;j<q;j++)
    { for(int i=j;i<h.length();i=i+q)
        {
            g+=h.charAt(i);
        }}
      System.out.println(g);  
}}