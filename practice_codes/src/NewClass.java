import java.io.*;
import java.util.*;
public class NewClass {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int ans=0;
        while(n>0)
        {
            ans^=sc.nextInt();
            n--;
        }
        System.out.println(ans);
    }
    
}
