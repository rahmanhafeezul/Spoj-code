import java.io.*;
import java.util.*;
public class NewClass26 {
    public static void main(String[] args)throws IOException
    {
        int arr[]={2,1,4,5,1,3,3};int max=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        for(int l=2;l<=arr.length;l++)
        {
            for(int i=0;i<=arr.length-l;i++)
            {
                int j=i+l-1;
                max=Math.max(max, l*min(i,j,l,arr));
               
                
                
            }
        }
        System.out.println(max);
    }
    public static int min(int a, int b,int c,int[] arr)
    {int min=100000;
        for(int i=a;i<=b;i++)
        {
            min=Math.min(min,arr[i]);
        }//System.out.println(min+" "+c);
                return min;
    }
    
}
