import java.io.DataInputStream;
import java.util.*;
public class FASHION {
static int partition(int A[], int p, int r) {
int i = p - 1;
int key = A[r];
for (int j = p; j < r; j++) {
if (A[j] < key) {
i++;
int temp = A[j];
A[j] = A[i];
A[i] = temp;
}
}
A[r] = A[i + 1];
A[i + 1] = key;
return i + 1;
}
static void quickSort(int[] A, int p, int r) {
if (p == r || (p > r))
return;
int q = partition(A, p, r);
quickSort(A, p, q - 1);
quickSort(A, q + 1, r);
}
public static void main(String [] args) {
Scanner s=new Scanner(System.in);
int T = s.nextInt();
while(T-->0) {
int n = s.nextInt();
int [] a = new int[n];
int [] b = new int [n];
for(int i=0;i<n;i++) {
a[i]=s.nextInt();
}
for(int i=0;i<n;i++) {
b[i]=s.nextInt();
}
quickSort(a, 0, n-1);
quickSort(b, 0, n-1);
int sum=0;
for(int i=0;i<n;i++) {
sum+=a[i]*b[i];
}
System.out.println(sum);
}
}}

