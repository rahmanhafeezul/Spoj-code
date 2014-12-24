import java.io.*;
import java.util.*;


public class NewClass23 {
    public static int[] p;
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
        int size=sc.nextInt();
        p=new int[size];
        int n=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            p[i]=sc.nextInt();
        }
        
        sort(p);
        int min=p[p.length-1]-p[0];
        
        
        for(int i=0;i<p.length-n+1;i++)
        {
            int j=i+n-1;
            min=Math.min(min, p[j]-p[i]);
            
        }
        System.out.println(min);
                
        t--;
    }
    }
    public static void sort(int[] a)
    {
       

        int left = 0;

        int right = a.length-1;

             

        quickSort(left, right,a);

    }
    private static void quickSort(int left,int right,int[] a){

         

        // If both cursor scanned the complete array quicksort exits

        if(left >= right)

            return;

         

        // For the simplicity, we took the right most item of the array as a pivot 

        int pivot = a[right];

        int partition = partition(left, right, pivot,a);

         

        // Recursively, calls the quicksort with the different left and right parameters of the sub-array

        quickSort(0, partition-1,a);

        quickSort(partition+1, right,a);

    }

     

    // This method is used to partition the given array and returns the integer which points to the sorted pivot index

    private static int partition(int left,int right,int pivot,int[] a){

        int leftCursor = left-1;

        int rightCursor = right;

        while(leftCursor < rightCursor){

                while(a[++leftCursor] < pivot);

                while(rightCursor > 0 && a[--rightCursor] > pivot);

            if(leftCursor >= rightCursor){

                break;

            }else{

                swap(leftCursor, rightCursor,a);

            }

        }

        swap(leftCursor, right,a);

        return leftCursor;

    }

     

    // This method is used to swap the values between the two given index

    public static void swap(int left,int right,int[] a){

        int temp = a[left];

        a[left] = a[right];

        a[right] = temp;

    }


    }
    

