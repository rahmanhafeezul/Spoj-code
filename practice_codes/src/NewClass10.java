import java.io.*;
import java.util.*;
public class NewClass10 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[500000];
        a[0]=0;
        for(int i=1;i<a.length;i++)
        {
            a[i]=a[i-1]+i;
        }
        while(true)
        {
            int n=sc.nextInt();
            if(n==-1)
                break;
            else
            {
               System.out.println(a[n-1]);
            }
        }
        for(int i=0;i<20;i++)
        {
            System.out.println(a[i]+" hi");
        }
    }
    
}
