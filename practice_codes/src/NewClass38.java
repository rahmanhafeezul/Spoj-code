import java.io.*;
import java.util.*;
public class NewClass38 {
    public static void main(String[] args)throws IOException
    {
        String s="byebye";
        String[] sq=new String[s.length()];
        for(int i=0;i<sq.length;i++)
        {
            sq[i]=s.substring(i, s.length())+s.substring(0, i);
        }
        int count=1;
        for(int f=1;f<sq.length;f++)
        {
            if(s.equals(sq[f]))
                count++;
                }
        System.out.println(count);
        
    }
    
}
