import java.io.*;
import java.util.*;
public class NewClass51 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            int n=sc.nextInt();
            if(n==0)
                break;
            else
            {
                System.out.println((n*(3*n+5))/2+1);
            }
        }
     
    }
    
}
