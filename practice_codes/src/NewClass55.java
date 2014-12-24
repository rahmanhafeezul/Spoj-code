import java.io.*;
import java.util.*;
public class NewClass55{
    private static Reader		in;
	private static PrintWriter	out;
    public static void main(String[] args)throws IOException
    {in = new Reader ();
    out = new PrintWriter (System.out, true);
        //Scanner sc=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            int n=in.nextInt();
            if(n==0)
                System.out.println(-1);
            else{  String g=in.readLine();
            //int arr[]=new int[n];
                String s=in.readLine();
                //System.out.println("s: "+s);
            String[] arr1=s.split(" ");
           
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
    }
    static class Reader {
		final private int			BUFFER_SIZE	= 1 << 16;
		private DataInputStream	din;
		private byte []			buffer;
		private int					bufferPointer, bytesRead;
		
		public Reader () {
			din = new DataInputStream (System.in);
			buffer = new byte [BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		
		public Reader (String file_name) throws IOException {
			din = new DataInputStream (new FileInputStream (file_name));
			buffer = new byte [BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		
		public String readLine () throws IOException {
			byte [] buf = new byte [1024];
			int cnt = 0, c;
			while ((c = read ()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String (buf, 0, cnt);
		}
		
		public int nextInt () throws IOException {
			int ret = 0;
			byte c = read ();
			while (c <= ' ')
				c = read ();
			boolean neg = (c == '-');
			if (neg)
				c = read ();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read ()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}
		
		public long nextLong () throws IOException {
			long ret = 0;
			byte c = read ();
			while (c <= ' ')
				c = read ();
			boolean neg = (c == '-');
			if (neg)
				c = read ();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read ()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}
		
		public double nextDouble () throws IOException {
			double ret = 0, div = 1;
			byte c = read ();
			while (c <= ' ')
				c = read ();
			boolean neg = (c == '-');
			if (neg)
				c = read ();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read ()) >= '0' && c <= '9');
			if (c == '.')
				while ((c = read ()) >= '0' && c <= '9')
					ret += (c - '0') / (div *= 10);
			if (neg)
				return -ret;
			return ret;
		}
		
		private void fillBuffer () throws IOException {
			bytesRead = din.read (buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}
		
		private byte read () throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer ();
			return buffer[bufferPointer++];
		}
		
		public void close () throws IOException {
			if (din == null)
				return;
			din.close ();
		}
	}
}





    

