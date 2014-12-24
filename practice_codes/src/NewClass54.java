import java.io.*;
import java.util.*;
public class NewClass54 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {br.readLine();
            int n=Integer.parseInt(br.readLine());
            if(n==0)
                System.out.println(-1);
            else{  br.readLine();
            //int arr[]=new int[n];
            String[] arr1=br.readLine().split(" ");
           
            if(arr1.length==1 )
                System.out.println(-1);
            else{   int j;
            for( j=arr1.length-1;j>0;j--)
            {
                if(Integer.parseInt(arr1[j-1])>Integer.parseInt(arr1[j]))
                    continue;
                else
                    break;
                    
            }
            if(j==0)
                System.out.println(-1);
            else
            {//System.out.println(j+" j");
            int a=Integer.parseInt(arr1[j]);
            sort(arr1,j-1,arr1.length-1);
//           String arr2[]={"1","5","4","8","3"};
//            sort(arr2,2,4);
                
           for(int fgh=0;fgh<arr1.length;fgh++)
           {
               System.out.print(arr1[fgh]);
           }System.out.println();
            
            }}}
            
            t--;
        }
    }

    private static void sort(String[] arr1, int i, int i0) {
        //public static void sort( int[] arr )
    
        int N = arr1.length;
        if (N == 0)
            return;
        /** find max and min values **/
        int max = Integer.parseInt(arr1[i]), 
                min = Integer.parseInt(arr1[i]);
        for (int h = i+1; h < N; h++)
        {
            if (Integer.parseInt(arr1[h]) > max)
                max = Integer.parseInt(arr1[h]);
            if (Integer.parseInt(arr1[h]) < min)
                min = Integer.parseInt(arr1[h]);
        }
        //System.out.println(max+" hello "+min);
        int range = max - min + 1;
 //System.out.println(range+" range");
        /** check if range is small enough for count array **/
        /** else it might give out of memory exception while allocating memory for array **/
        int[] count= new int[max - min + 1];
 
        for(int numb=i;numb<N;numb++){
            int number=Integer.parseInt(arr1[numb]);
		count[number - min]++;
	}
        /** modify count so that positions in final array is obtained **/
        int z= i;arr1[z]=arr1[i+1];z++;
	for(int ig= min;ig <= max;ig++){
		while(count[ig - min] > 0 && z<arr1.length){
			arr1[z]= String.valueOf(ig);
			z++;
			count[ig - min]--;
		}
	}
    }}
    

