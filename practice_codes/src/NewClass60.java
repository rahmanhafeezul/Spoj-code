import java.io.*;
import java.util.*;

public class NewClass60 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int b=sc.nextInt();
        int x=r/2+2;
        int y=r+b;
        int h=(int)Math.sqrt(x*x-4*y);
        //System.out.println(h);
        int a=(x+(h))/2;
        int f=x-a;
        if(a>=f)
            System.out.println(a+" "+f);
        else
            System.out.println(f+" "+a);
    }
    
}
