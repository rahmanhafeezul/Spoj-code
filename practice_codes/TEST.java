import java.util.*;
import java.io.*;
public class TEST
{
    public static void main(String[] args)throws IOException
    {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
        while(n!=42)
        {
            System.out.println(n);
            n=s.nextInt();
        }
    }
}