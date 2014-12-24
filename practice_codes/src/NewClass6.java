import java.io.*;
import java.util.*;

public class NewClass6 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {int a=sc.nextInt();//System.out.println(a+" a");
        int[] aa=new int[a];
        while(a>0)
        {
            aa[a-1]=sc.nextInt();
            
            a--;
        }
        int b=sc.nextInt();//System.out.println(b+" b");
        int[] bb=new int[b];
        while(b>0)
        {
           
            bb[b-1]=sc.nextInt();
            
            b--;
        }//System.out.println("hi");
        int min=Math.abs(aa[0]-bb[0]);
       // System.out.println(min+" min");
//        for(int i=0;i<aa.length;i++)
//        {
//           System.out.println(aa[i]+" aa");
//        }
//         for(int j=0;j<bb.length;j++)
//            {
//                System.out.println(bb[j]+" bb");
//            }
        for(int i=0;i<aa.length;i++)
        {
            for(int j=0;j<bb.length;j++)
            {
                if(Math.abs(aa[i]-bb[j])<=min)
                    min=Math.abs(aa[i]-bb[j]);
            }
        }
        System.out.println(min);
        
            
            n--;
        }
    }
    
}
