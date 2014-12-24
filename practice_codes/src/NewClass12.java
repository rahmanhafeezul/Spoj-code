import java.io.*;
import java.util.*;

public class NewClass12 {
    public static void main(String[] args)throws IOException
    {
        int p[]={12,15,16,16,10,21,18,12,17,18};
        int v[]={3,8,9,6,2,9,4,4,8,9};
        int W=50;
        int n=p.length;
        int min=10;
        System.out.println(solution(p,v,W,n,min));
               
    }
    public static int solution(int p[],int v[],int W, int n,int min)
    {
        if (W<0 || n==0)
        {return 0;}
        else 
            if(p[n-1]>W)
        {
            return solution(p,v,W,n-1,min);
        }
        else
            return Math.max(v[n-1]+solution(p,v,W-p[n-1],n-1,min),solution(p,v,W,n-1,min));
    
    }
    
}
