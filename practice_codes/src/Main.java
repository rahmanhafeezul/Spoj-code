import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int a=-13/(-2);int d=-13%(-2);
         int b=7/(-2);int e=7 %(-2);
         int c=-3/(-2);int f=-3 %(-2);
         System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
        int n=-13;
        String s="";
        int m=0;
        // String l="";
        // l=l+Integer.toString(2);
        // System.out.println(l);
        
        while(n!=1)
        {
        	if(n<0)
        	{
        	m=n%(-2)+2;s+=(Integer.toString(m));
        	n=n/(-2)+1;	
        	}
        	else
        	{
        	m=n%(-2);s+=(Integer.toString(m));
        	n=n/(-2);
        	}
        }
        System.out.println(reverse(s+Integer.toString(1)));
        
            
    }

    private static String reverse(String string) {
         //To change body of generated methods, choose Tools | Templates.
        String reversedString = "";
        for(int i=string.length(); i>0; i--) {
            reversedString += string.charAt(i-1);
        }   

        return reversedString;
    }
}





