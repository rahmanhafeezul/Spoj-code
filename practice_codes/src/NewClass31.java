import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {//done by dynamic programming
        // write your code in Java SE 8
        //int arr[]={7,6,10,9,7,9,7,8};
        long amp[]=new long[A.length];//amp[i] has the amplitude when the subsequence has the element A[i]
        long arr_size=A.length;
        long diff[]=new int[A.length];//contains the maximum difference till A[i]
       // int maxDiff(int arr[], int arr_size)
        for(int i=0;i<arr_size;i++)
        {
            amp[i]=1;
        }
        for(int i=0;i<arr_size;i++)
        {
            diff[i]=0;
        }
        for(int i=1;i<arr_size;i++ )
        {
            for(int j=0;j<i;j++)
            {
                if(A[i]-A[j]==0)
                {
                    if(amp[i]<1+amp[j])
                        amp[i]=1+amp[j];
                }
                if(A[i]-A[j]==1)
                {
                    if(diff[j]==0 && amp[i]<1+amp[j])
                    {amp[i]=1+amp[j];diff[i]=1;}
                    
                    
                }
                if(A[i]-A[j]==-1)
                {
                    if(diff[j]==1 && amp[i]<1+amp[j])
                    {amp[i]=1+amp[j];diff[i]=0;}
                }
            }}
            int count=amp[0];
            for(int im=0;im<arr_size;im++)
            {
                count=Math.max(count,amp[im]);
            }
            
        
       // System.out.println(count);
        return count;
        

    }
}
