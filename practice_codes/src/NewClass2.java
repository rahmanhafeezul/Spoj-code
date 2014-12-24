import java.io.*;
import java.util.*;
public class NewClass2 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            long l=sc.nextLong();
            if(l%4==3)
                System.out.println("No");
            
                
            n--;
        }
    }
    
}
