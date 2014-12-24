import java.io.*;
import java.util.*;
public class NewClass56 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[1001];
        arr[0]=0;
        arr[1]=30;
        arr[2]=42;
        
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            System.out.println(arr[n]);
            t--;
        }
    }
    
}
