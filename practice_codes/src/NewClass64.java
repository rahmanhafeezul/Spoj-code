import java.io.*;
import java.util.*;
public class NewClass64 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        while(n>0)
        {int flag=0;
            String s=br.readLine();
            int checker=0;
            for(int i=0;i<s.length();i++)
            {int val=s.charAt(i)-'a';
                if((checker & (1<<val))!=0)
                {flag =1;break;}
                checker= checker | (1<<val);
                
            }
            if(flag==1)
                System.out.println("not unique");
            else
                System.out.println("unique");
            n--;
        }
    }
    
}
