import java.io.*;
import java.util.*;
public class NewClass28 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int count=1;String st="";int i;
        for(i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
                count++;
            else
            {if(count==1)
            {st+=Character.toString(s.charAt(i));}
            else{   st+=Character.toString(s.charAt(i))+count;}
                count=1;
            }
        }
        if(count==1)
            {st+=Character.toString(s.charAt(i));}
            else{   st+=Character.toString(s.charAt(i))+count;}
        System.out.println(st);
    }
    
}
