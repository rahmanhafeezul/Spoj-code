import java.io.*;
import java.util.*;
public class ONP
{
    public static void main(String[] args)throws IOException
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0)
        {String a=s.next();
rpn(a);
        n--;
        }
    }
    public static void rpn(String s)
    {stack st=new stack();
        for(int i=0;i<s.length();i++)
        //System.out.println(s.charAt(i));
        if(s.charAt(i)=='(')
        {
            
        }
        else if(s.charAt(i)==')')
        {
            st.pop();
        }
        else if((s.charAt(i)=='+')||(s.charAt(i)=='-')||
                (s.charAt(i)=='*')||(s.charAt(i)=='/')||(s.charAt(i)=='^'))
        {
            st.push(s.charAt(i));
        }
        else {
            System.out.print(s.charAt(i));
        }System.out.println();
    }
    
}
class stack{
    Vector v;
    public stack()
            {
                v=new Vector();
                
            }
            public void push(Object obj)
            {
                v.add(obj);
            }
            public void pop()
            {
                if(v.size()>0)
                {
                    System.out.print(v.elementAt(v.size()-1));
                    v.removeElementAt(v.size()-1);
                }
            }
}