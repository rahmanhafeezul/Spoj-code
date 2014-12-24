import java.io.*;
import java.util.*;
public class NewClass9 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {String ss[];int flag=0;
        String s=sc.nextLine();
        
        if("*".equals(s))
            break;
        else
        { ss =s.toLowerCase().split(" ");
        if(ss.length==1)
        {System.out.println("Y");continue;}
        
        else
        {char ch=ss[0].charAt(0);
            for(int i=1;i<ss.length;i++)
        {
          if(ch!=ss[i].charAt(0))
          {flag=1;break;}
          else
          {flag=0;}
        }
        }
        if(flag==0)
            System.out.println("Y");
        else
            System.out.println("N");
        }
            }
    }
    
}
