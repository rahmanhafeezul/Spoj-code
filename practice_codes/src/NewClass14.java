import java.io.*;
import java.util.*;
public class NewClass14 {
    public static void main(String[] args)throws IOException
    {
        int W=100;
        int p[]={1,30};
        int val[]={1, 50};
        int n=p.length;
        int k=solution(p,val,W,n);
        if(k<0)
            System.out.println("This is impossible");
        else
            System.out.println(k);
    }
    public static int solution(int p[],int val[],int W,int n)
    {
        if(W==0)
            return 0;
        else if(n==0)
            return 0x7fffffff;
        else if(p[n-1]>W)
            return solution(p,val,W,n-1);
        else
            return Math.min(solution(p,val,W,n-1), val[n-1]+solution(p,val,W-p[n-1],n));
    }
    
}
