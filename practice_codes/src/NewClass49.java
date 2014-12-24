import java.io.*;
import java.util.*;
public class NewClass49 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());String h="";
        while(t>0)
        {HashMap<String,Integer> map=new HashMap<String,Integer>();
            for(int i=1;i<=16;i++)
        {
            String s=br.readLine();
            String[] arr=s.split(" ");
            
            if(Integer.parseInt(arr[2])>Integer.parseInt(arr[3]))
            {
                if(map.containsKey(arr[0]))
                {int a=map.get(arr[0]);
                if(a==3)
                {h=(arr[0]);}
                map.put(arr[0], a+1);}
                else
                {map.put(arr[0], 1);
                }
                if(map.containsKey(arr[1]))
                {}
                else
                {map.put(arr[1], 0);
                }
                
            }
            else
            {if(map.containsKey(arr[1]))
                {int a=map.get(arr[1]);
                if(a==3)
                {h=(arr[1]);}
                map.put(arr[1], a+1);}
                else
                {map.put(arr[1], 0);
                }
            if(map.containsKey(arr[0]))
                {}
                else
                {map.put(arr[0], 0);
                }
                
            }}System.out.println(h);
            t--;
        }
    }
}
