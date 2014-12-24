import java.io.*;
import java.util.*;
public class NewClass18 
{
public static void main(String[] args)throws IOException
{
    int arr[]={1,2,3};
    int curr_sum=arr[0];
    int max_sum=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        curr_sum=Math.max(arr[i], arr[i]+curr_sum);
        max_sum=Math.max(max_sum, curr_sum);
    }
    System.out.println(max_sum);
}
}
