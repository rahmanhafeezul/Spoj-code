import java.io.*;
import java.util.*;

public class NewClass36 {
     public static void main(String[] args)throws IOException
     {
         int[] a={1,2,3};
          boolean[] arr1=new boolean[a.length];
          for(long i=0;i<arr1.length;i++)
          {
              arr1[(int)i]=false;
          }
        arr1[0]=true;long i=0;
     while(true)
        {
            i=i+a[(int)i];
            //System.out.println(i+" i "+a[i]);
           if(i<a.length && arr1[(int)i]==false) 
           {arr1[(int)i]=true; 
           //System.out.println("done");
           }
           else
               break;
           
        }//System.out.println(count);
        long count=0;
        for(long h=0;h<arr1.length;h++)
        {
            if((arr1[(int)h])==false)
                count++;
        }
        System.out.println ((int)count);
     }
}