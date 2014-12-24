import java.io.*;
import java.util.*;
public class NewClass62 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            long[] arr=new long[n+1];
            arr[0]=0;
            arr[1]=0;
            for(int j=2;j<=n;j++)
            {
                arr[j]=arr[j-1]+fac(j);
            }
            System.out.println(arr[n]);
            t--;
        }
    }

    private static final long fac(long n) {
    if (n < 1) {
        return 0;
    }
    if (n % 2 == 0) {
        return 2;
    }
    // only need aproximate end-point... even if n is larger than 48 bits
    // (the largest accurate integer number in double),
    // the sqrt will be only off by 1 at most.
    long root = (long)(Math.sqrt(n)) + 1;
    for (long i = 3; i <= root; i += 2) {
        if (n % i == 0) {
            return i;
        }
    }
    // it's prime!
    return n;
}
    
}
