import java.io.*;
import java.util.*;
public class NSTEPS{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0)
        {int a=s.nextInt();
        int b=s.nextInt();
        check(a,b);
           n--; 
        }
    }
    public static void check(int x,int y)
    {
        if(x%2==0){ 
if(y==x) {
    System.out.println(x*2);
}
else if(y==x-2)
{System.out.println(x*2-2);

}
else 
    System.out.println("No Number");
}else{ //odd
if(y==x) System.out.println(x*2-1);
else if(y==x-2) System.out.println(x*2-3);
else System.out.println("No Number");
}
    }
}