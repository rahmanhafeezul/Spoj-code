import java.io.*;
import java.util.*;
public class CANDY
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        {Vector v=new Vector();
            while(true)
            {
                            int n=s.nextInt();
if(n==-1)
            {
                break;
            }
            else{ 
            while(n>0)
            {
               v.add(s.nextInt()); 
               n--;
            }//System.out.println(v);
            calcu(v);v=new Vector();
            }
            }
        }}
        public static void calcu(Vector g)
        {
            int size=g.size(),som=0;
            for(int i=0;i<size;i++)
            {
                som+=(Integer)g.elementAt(i);
            }//System.out.println(som/size);
            if(som%size!=0)
                System.out.println("-1");
            else{int avg=som/size,count=0;
            
            for(int i=0;i<size;i++)
            {
                if(avg-(Integer)g.elementAt(i)>0)
                    count+=avg-(Integer)g.elementAt(i);
            };System.out.println(count);
        }}
        
    
}