-----------------------------------

Time Complexity of StringBuffer is more Efficient  rather than String 

public class Solution 
{
	public static String reverseString(String str) 
	{
		 str=str.trim();                         
         String a[]=str.split("\\s+");
         StringBuffer sb=new StringBuffer();
         for(int i=a.length-1;i>=0;i--)
         {
             sb.append(a[i]);
             sb.append(" ");
         }
         
         String s=sb.toString();
        s=s.trim();
        return s;
	}
}

--------------------------------------------------------------

import java.util.*;
public class Solution {
	public static int firstMissing(int[] arr, int n) {
		// Write your code here.	
        Arrays.sort(arr);
        int ans = 1;
        for(int i : arr){
            if(i == ans) ++ans;
        }
        return ans;        
	}
}

------------------------------------------------------