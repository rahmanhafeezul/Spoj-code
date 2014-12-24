import java.io.*;
import java.util.*;
public class NewClass37
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String[] st=s.split(",");
        String a="";
        for(int i=0;i<st.length;i++)
        {
            a+=st[i];
        }
        System.out.println(a);
    }
}