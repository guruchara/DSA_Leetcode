import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
public class Mains {

    public static int [] nsl(int a[])
    {
       Stack<Integer>st=new Stack<Integer>();
       int ans[]=new int[a.length];
       
       Arrays.fill(a,0);
       
       for(int i=a.length-1;i>=0;i--)
       {
           while(st.size()!=0 && a[st.peek()]>a[i])
           {
               int idx=st.pop();
               ans[idx]=a[i];
           }
           st.push(i);
       }
       return ans;
    }
    public static int [] nsr(int a[])
    {
        Stack<Integer>st=new Stack<Integer>();
        
        int ans[]=new int[a.length];
        Arrays.fill(a,0);
        
        for(int i=0;i<a.length;i++)
        {
            while(st.size()!=0 && a[st.peek()]>a[i])
            {
                int idx=st.pop();
                ans[idx]=a[i];
            }
            st.push(i);
        }
        return ans;
    }
    public static int maxdiff(int a[])
    {
	    int nsol[]=nsl(a);
	    int nsor[]=nsr(a);
	    
	    int max=Integer.MIN_VALUE;
	    
	    for(int i=0;i<a.length;i++)
	    {
	        int x=(int)Math.abs(nsol[i]-nsor[i]);
	        max=Math.max(x,max);
	    }
	    return max;
    }
     public static void main(String[] args) throws Exception
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int n=Integer.parseInt(br.readLine());
         
         int a[]=new int[n];

         for(int i=0;i<n;i++)
         {
             a[i]=Integer.parseInt(br.readLine());
         }

         System.out.println(maxdiff(a));
     }
}
