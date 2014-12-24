import java.io.*;
import java.util.*;
public class NewClass48 {
    private static Reader		in;
	private static PrintWriter	out;
 public static void main(String[] args)throws IOException
 {
     in = new Reader ();
    out = new PrintWriter (System.out, true);
        int[][][] dp=new int[101][100][2];dp[1][0][0]=1;
        dp[1][0][1]=1;
        for(int i=0;i<100;i++)
        {
            for(int j=0;j<100;j++)
            {
                for(int k=0;k<2;k++)
                {
                    if(i==0)
                        dp[i][j][k]=0;
                    else if(j==0)
                    {dp[i+1][0][1]=dp[i][0][0];
                    dp[i+1][0][0]=dp[i][0][1]+dp[i][0][0];}
                    else if(i==j)
                        dp[i][j][k]=0;
                }
            }
        } 
        
        for(int i=1;i<100;i++)
        {
            for(int j=0;j<99;j++)
            {
                
                    dp[i+1][j+1][0]=dp[i][j+1][1]+dp[i][j+1][0];
                    dp[i+1][j+1][1]=dp[i][j][1]+dp[i][j+1][0];
               
            }
        }
       

        
        int t=in.nextInt();
        while(t>0)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            out.println(a+" "+ (dp[b][c][0]+dp[b][c][1]));
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





