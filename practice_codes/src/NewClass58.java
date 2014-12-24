import java.io.*;
import java.util.*;
public class NewClass58 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {
            int n=Integer.parseInt(br.readLine());double arr[]=new double[n];int i=0;
            while(n>0)
            {
              String s[]=br.readLine().split(" ");
              arr[i]=Double.parseDouble(s[1]);i++;n--;
            }
            sort(arr);
            double max=arr[1]-arr[0];
            for (int ih = 1; ih < arr.length-1; ih++)
            { max=Math.max(max,arr[ih+1]-arr[ih] );
            }System.out.println(Math.ceil(360.0-max)*12);
  
            t--;
        }
    }
   

  // sort the entire array a in-place using merge sort
  public static void sort(double[] a) {
    sort(a, 0, a.length);
  } 

  // Sort a[lo, hi). 
  public static void sort(double[] a, int lo, int hi) {
    int N = hi - lo;        // number of elements to sort

    // 0- or 1-element file, so we're done
    if (N <= 1) return; 

    // recursively sort left and right halves
    int mid = lo + N / 2; 
    sort(a, lo, mid); 
    sort(a, mid, hi); 

    // merge two sorted subarrays into auxiliary array aux
    double[] aux = new double[N];
    int i = lo, j = mid;
    for (int k = 0; k < N; k++) {
      if      (i == mid)    { aux[k] = a[j]; j++; }
      else if (j == hi)     { aux[k] = a[i]; i++; }
      else if (a[j] < a[i]) { aux[k] = a[j]; j++; }
      else                  { aux[k] = a[i]; i++; }
    }

    // copy back into a
    for (int k = 0; k < N; k++) {
      a[lo + k] = aux[k]; 
    }
  } 

  // print array
  
    

  // test client
  
}
    

