

-----------------------------------------------------------------
problem code : DIFACTRS

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int a[]=new int[n];
		int p=0;
		for(int i=1;i<=n;i++)
		{
		    if(n%i==0)
		    {
		        c++;
		        a[p]=i;
		        p++;
		    }
		}
		System.out.println(c);
		for(int j=0;j<c;j++)
		{
		    System.out.print(a[j] + " ");
		}
	}
}

-------------------------------------------------------------------------

problem code : ISBOTH

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%5==0 && n%11!=0)
		{
		    System.out.println("ONE");
		    return;
		}
		
		if(n%11==0 && n%5!=0)
		{
		    System.out.println("ONE");
		    return;
		}
		if(n%5==0 && n%11==0)
		{
		    System.out.println("BOTH");
		    return;
		}
		
		
		System.out.println("NONE");
	}
}

-------------------------------------------------------------------------

problem code : removePalindromeSub

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0;
		for(i=0;i<a.length;i++)
		{
		    a[i]=sc.nextInt();
		}
		
		i=0;
		int j=a.length;
		while(i<j)
		{
		    int t=a[i];
		    a[i]=a[j-1];
		    a[j-1]=t;
		    i++;
		    j--;
		}
		
		for(int val:a)
		{
		    System.out.print(val +" ");
		}
	}
}

----------------------------------------------------------------

problem code : FINDMELI

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int a[]=new int[n];
	     
	     for(int i=0;i<n;i++)
	     {
	         a[i]=sc.nextInt();
	     }
	     int k=sc.nextInt();
	     
	     for(int j=0;j<a.length;j++)
	     {
	         if(a[j]==k)
	         {
	             System.out.println(j);
	             return;
	         }
	     }
	     
	     System.out.println(-1);
	}
}

-----------------------------------------------------------------------

problem code : VALTRI

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%5==0 || n%6==0)
		{
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}

---------------------------------------------------------------------------

problem code: ADDNATRL 

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
		    sum+=i;
		}
		System.out.println(sum);
	}
}

----------------------------------------------------------------------------





class Solution {
    public List<Integer> countSmaller(int[] nums) {                 
        int k=0;
        int n=nums.length;
        int a[]=new int[n];
        ArrayList<Integer> arr = new ArrayList<> ();
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j && nums[j]<nums[i])
                {
                   c++;
                }
            }
            arr.add(c);
        }
      return arr;    
    }
}
















=========================================

import java.util.*;
import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner sc=new Scanner(System.in);
		  int T=sc.nextInt();
		  for(int i=0;i<T;i++)
		  {
		      int a=sc.nextInt();
		      int b=sc.nextInt();
		      System.out.println(symbol(a,b));
		  }
		  sc.close();
	}
	public static char symbol(int a,int b)
	{
	           if(a>b)
		      {
		         return '>';
		      }
		      else if(a<b)
		      {
		          return '<';
		      }
		      else{
		         return '=';
		      }
	}
}












===========================

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
       Scanner sc=new Scanner(System.in);
       int T =sc.nextInt();
       for(int i=0;i<T;i++)
       {
         int n =sc.nextInt();
         System.out.println(firstlast(n))
	   }
	}
	sc.close();
	public static int firstlast(int n)
	{
	    int a[]=new int[120];
	    while(n!=0)
	    {
	        a[i]=n%10;
	        i++;
	        n/=10;
	    }
	     int sum= a[0]+a[i-1];
	     return sum;
	}
}


=====================================

import java.util.*;
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int n=sc.nextInt();
            System.out.println(sum(n));
        }
        sc.close();
	}
	public static int sum(int n)
	{
	    int res=0;
	    while(n!=0)
	    {
	        res=res+n%10;
	        n/=10;
	    }
	    return res;
	}
}

==================================================


import java.util.*;
import java.util.Scanner;
class Main
{
    public static void main(String[] args) throws Exception
    {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0;i<T;i++)
       {
           int a=sc.nextInt();
           int b=sc.nextInt();
           System.out.println(add(a,b));
       }
       sc.close();
    }
    public static int add(int a,int b)
    {
        return a+b;
    }
}

=========================================

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    for(int i=0;i<T;i++)
	    {
	        int n=sc.nextInt();
	        System.out.println(check(n));
	    }
	    sc.close();
	}
	public static int check(int n)
	{
	    int c=0;
	    int res;
	    while(n!=0)
	    {
	        res=n%10;
	        if(res==4)
	        {
	            c++;
	        }
	        n/=10;
	    }
	    return c;
	}
}

=================================================


import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
          Scanner sc=new Scanner(System.in);
          int T =sc.nextInt();
          for(int i=0;i<T;i++)
          {
             int a=sc.nextInt();
             int b=sc.nextInt();
             int c=sc.nextInt();
             if((a+b+c)==180)
             {
                 System.out.println("YES");
             }
             else
             {
                 System.out.println("NO");
             }
          }
 	}
}

=============================================

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner(System.in);
		int T =sc.nextInt();
		int a[]=new int[T];
		for(int i=0;i<T;i++)
		{
		    a[i]=sc.nextInt();
		}
		int c=0;
		int x=0;
		for(int i=0;i<T;i++)
		{
		    if(a[i]%2==0)
		    {
		        c++;
		    }
		    else
		    {
		        x++;
		    }
		}
		if(c>x)
		{
		    System.out.println("READY FOR BATTLE");
		}
		else
		{
		    System.out.println("NOT READY");
		}
		
	}
}

===================================================


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T =sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    int n=sc.nextInt();
		    System.out.println(palindrome(n));
		}
		sc.close();
	}
	public static String palindrome(int n)
	{
	    int temp=n;
	    int res=0;
	    while(n!=0)
	    {
	        res=res*10+n%10;
	        n/=10;
	    }
	    if(res==temp)
	    {
	        return "wins";
	    }
	    else
	    {
	        return "loses";
	    }
	}
}


========================================================

