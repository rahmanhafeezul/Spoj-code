import java.io.*;
import java.util.*;
public class NewClass41 {
    private static Reader		in;
	private static PrintWriter	out;
    public static void main(String[] args)throws IOException
    {in = new Reader ();
    out = new PrintWriter (System.out, true);
    int t=in.nextInt();int[][] inp;
    while(t>0)
    {   
        int v=in.nextInt();
        inp=new int[v][v];
        
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                inp[i][j]=in.nextInt();
            }
        }
//        for(int i=0;i<v;i++)
//        {
//            for(int j=0;j<v;j++)
//            {
//                out.println(inp[i][j]+ " hi");
//            }
//        }
        int count=0;Vector vi=new Vector();String s="";
        for(int k=0;k<v;k++)
        {
           for(int i=0;i<v;i++)
           {
               for(int j=0;j<v;j++)
               {
                   if(i==j || j==k)
                       continue;
                   else
                   {
                       if(i<j && inp[i][j]<(inp[i][k]+inp[k][j]))
                       {count++;vi.add(s+(i+1)+" "+(j+1));s="";}
                           
                   }
                       
               }
           }
        }
        //out.println(count+" result");
        for(int u=vi.size()-1;u>=0;u--)
        {
            out.println(vi.elementAt(u));
        }
        t--;
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

