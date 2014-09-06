

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
     
     
    public class TETRA {
     
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
    public static void main(String[] args) throws NumberFormatException, IOException {
    int testCases = Integer.parseInt(br.readLine());
    while(testCases-- > 0) {
    compute();
    }
    }
     
    private static void compute() throws IOException {
    String[] line = br.readLine().split(" ");
    double a1 = Short.parseShort(line[0]);
    double a2 = Short.parseShort(line[1]);
    double a3 = Short.parseShort(line[2]);
    double a4 = Short.parseShort(line[3]);
    double a6 = Short.parseShort(line[4]);
    double a5 = Short.parseShort(line[5]);
    if(a1 == a2 && a2 == a3 && a3 == a4 && a4 == a5 && a5 == a6) {
    System.out.printf("%.4f\n", a1 / (Math.sqrt(24)));
    return;
    }
    double a1s = a1*a1;
    double a2s = a2*a2;
    double a3s = a3*a3;
    double a4s = a4*a4;
    double a5s = a5*a5;
    double a6s = a6*a6;
    double V = Math.sqrt((a1s*a5s*(a2s+a3s+a4s+a6s-a1s-a5s) +
    a2s*a6s*(a1s+a3s+a4s+a5s-a2s-a6s) +
    a3s*a4s*(a1s+a2s+a5s+a6s-a3s-a4s) -
    a1s*a2s*a4s -
    a2s*a3s*a5s -
    a1s*a3s*a6s -
    a4s*a5s*a6s) / 144);
    double s1 = (double)(a1+a2+a4)/2;
    double s2 = (double)(a2+a3+a5)/2;
    double s3 = (double)(a3+a6+a1)/2;
    double s4 = (double)(a4+a5+a6)/2;
    double s1sq = s1*(s1-a1)*(s1-a2)*(s1-a4);
    double s2sq = s2*(s2-a2)*(s2-a3)*(s2-a5);
    double s3sq = s3*(s3-a3)*(s3-a6)*(s3-a1);
    double s4sq = s4*(s4-a4)*(s4-a5)*(s4-a6);
    double S = Math.sqrt(s1sq) +
    Math.sqrt(s2sq) +
    Math.sqrt(s3sq) +
    Math.sqrt(s4sq);
    double r = V / (S / 3);
    System.out.printf("%.4f\n", r);
    }
    }

