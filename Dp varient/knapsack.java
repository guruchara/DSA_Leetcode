import java.util.*;
import java.util.Scanner;
import java.io.*;
public class knapsack
{
    public static int _knapsack(int W,int val[],int wt[],int n)
    {
        if(W==0|| n==0)
        {
            return 0;
        }

        if(wt[n-1]<=W)
        {
           int ans=Math.max(val[n-1]+_knapsack(W-wt[n-1], val, wt, n-1),_knapsack(W, val, wt, n-1));
           return ans;
        }
        else{
            return _knapsack(W, val, wt, n-1);
        }
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int n=Integer.parseInt(br.readLine());

        int val[]=new int[n];
         

        for(int i=0;i<val.length;i++)
        {
            val[i]=Integer.parseInt(br.readLine());
        }

        int wt[]=new int[n];

        for(int i=0;i<wt.length;i++)
        {
            wt[i]=Integer.parseInt(br.readLine());
        }

        int W=Integer.parseInt(br.readLine());

        int ans=_knapsack(W,val,wt,n);

        System.out.println(ans);
    }
}