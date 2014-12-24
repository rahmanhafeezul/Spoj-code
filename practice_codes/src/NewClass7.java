/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HafeezulRahman
 */
import java.io.*;
import java.util.*;
public class NewClass7 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=10;int j=0;
        int[] v=new int[10];
        while(n>0)
        {
            v[j]=sc.nextInt();j++;
            n--;
        }
        int sum=0;int i=0;
        while(i<10)
        {sum+=v[i];
        if(sum>=100)
            break;
        i++;
            
        }
        if(i<=9){
			sum-=v[i];
			if((100-sum)>=(sum+v[i]-100))
				System.out.println(sum+v[i]);
			else
				System.out.println(sum);
		}else{
			System.out.println(sum);
		}
            
    }
}
