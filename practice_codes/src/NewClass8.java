import java.io.*;
import java.util.*;
public class NewClass8 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String s="1,23,123,5";String g="";
        String[] st=s.split(",");
        for(int i=0;i<st.length;i++)
        {
            g+=st[i];
        }
        System.out.println(g);
        
    }
    
}
