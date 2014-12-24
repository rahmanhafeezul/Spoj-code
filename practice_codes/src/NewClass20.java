import java.io.*;
import java.util.*;
public class NewClass20 {
    public static void main(String[] args)throws IOException
    {BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int a=Integer.parseInt(br.readLine());
    String n[]=br.readLine().split(" ");
    
        
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {
            String A[]=br.readLine().split(" ");
            if(Integer.parseInt(A[0])==1)
            {
              int curr_sum=Integer.parseInt(n[Integer.parseInt(A[1])-1]);
              int max_sum=Integer.parseInt(n[Integer.parseInt(A[1])-1]);
              for(int i=Integer.parseInt(A[1]);i<=Integer.parseInt(A[2])-1;i++)
              {
                  curr_sum=Math.max(Integer.parseInt(n[i]), Integer.parseInt(n[i])+curr_sum);
                  max_sum=Math.max(curr_sum,max_sum);
                  
              }
              System.out.println(max_sum);
            }
            else
            {
               n[Integer.parseInt(A[1])-1]=
                       (A[2]); 
            }
            t--;
        }
        
    }
    
}
