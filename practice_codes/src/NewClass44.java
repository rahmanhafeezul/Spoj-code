import java.io.*;
import java.util.*;
public class NewClass44 {
    private static Reader		in;
	private static PrintWriter	out;
 public static void main(String[] args)throws IOException
 {
     in = new Reader ();
		out = new PrintWriter (System.out, true);
    
                int n=in.nextInt();
                int[] arr=new int[n+1];arr[0]=0;
                int[] gd=new int[n-1];gd[0]=0;int i=1;
                while(n>0)
                {
                    arr[i++]=in.nextInt();
                    n--;
                }int j=0;
//                for(int y=0;y<arr.length;y++)
//                {
//                    out.println(arr[y]+" arrd");
//                }
                for(int g=1;g<arr.length-1;g++)
                {int c=(arr[g+1]-arr[g]);
                //out.println(c+" c");
                    gd[j++]=c;
                }
//                for(int y=0;y<gd.length;y++)
//                {
//                    out.println(gd[y]+" gd");
//                }
                int gcd=gd[0];
                for(int gf=1;gf<gd.length;gf++)
                {
                    gcd=gcdret(gcd,gd[gf]);
                }
                //out.println(gcd);
                
                int count=0;
                for(int s=0;s<gd.length;s++)
                {
                    count+=(gd[s]/gcd-1);
                }
                out.println(count);
                
                
                
    }

    private static int gcdret(int a, int b) {
if(b>a)
    return gcdret(b,a);
else
    if(b==0)
        return a;
else
        return gcdret(b,a%b);
        
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




