import java.io.*;
import java.util.*;
public class NewClass52 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)

        {
            int n=sc.nextInt();
            if(n%2==0)
            {
              String s=Integer.toBinaryString(n);
				s=new StringBuffer(s).reverse().toString();
				System.out.println(Integer.parseInt(s,2));
            }
            else
            {
                System.out.println(n);
            }
            t--;
        }
    }
    
}
