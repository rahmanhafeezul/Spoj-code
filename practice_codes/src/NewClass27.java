import java.io.*;
import java.util.*;
public class NewClass27 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int count=1;int curr=0;int g=0;int h=0;String st="";
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {count++;g=i+1;}
            else
                count=1;
            //st=st+Character.toString(s.charAt(i))+Integer.toString(count);
            
            
            
            //curr=Math.max(curr,count);
            if(curr<=count)
            {
                curr=count;
               h=g;
            }
        }
        System.out.println(curr+" "+h+" "+st);
    }
    
}
