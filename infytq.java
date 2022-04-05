import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
public class shruti1{

    
    public static void check(String str)
    {
         String outstr="";
         int i=0;
        for( i=0;i<str.length();i++)
        {
             if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u')
               {
                   outstr+=str.charAt(i);
               }
        }
        char arr[]=outstr.toCharArray();
        
        Arrays.sort(arr);
        String kk=new String(arr);
        
      
         char ch='a';
        for( i=0;i<kk.length();i++)
        {
             if(kk.charAt(i)=='a' || kk.charAt(i)=='e' || kk.charAt(i)=='i'|| kk.charAt(i)=='o' || kk.charAt(i)=='u')
               {
                   ch=kk.charAt(i);
                   break;
               }
        }
    
        int k=str.indexOf(ch);
   
         if(k==-1)
         {
             kk+="NA-1";
         }
         else
         {
            kk+=k;
         }

          String y="";

         for( i=0;i<str.length();i++)
        {
             if(str.charAt(i)!='a' && str.charAt(i)!='e'&& str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u')
               {
                   y+=str.charAt(i);
               }
        }
        
        char p[]=y.toCharArray();        
        
        Arrays.sort(p);
  
        char j=p[p.length-1];
        String h=new String(p);

        StringBuffer sb=new StringBuffer(kk);

        sb.append(h);

        

         int rr=str.lastIndexOf(j);

         sb.append(rr);

         System.out.println(sb);
         // gurucharan
 
    }
    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in);
        String instr=sc.nextLine();

        check(instr); 
    }
}

------------------------------------------------------------------

import java.util.*;

public class infyfeb{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String instr = "dbabbca";
        String instr=sc.nextLine();
        // String[] str = { "bat", "ball","rat","bat","bat","car","rat"};
        String str[]=sc.nextLine().split(",");
        char[] inarr = instr.toCharArray();
        char[] darr = new char[inarr.length];
        int index = 0;
        for (int i = 0; i < inarr.length; i++) {
            int f = 0;

            for (int j = 0; j < i; j++) {
                if (inarr[i] == inarr[j]) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                darr[index] = inarr[i];
                index++;
            }
        }

        String result = "";
        String dr = "";
        for (int i = 0; i < darr.length; i++) {
            dr = dr + darr[i];
        }
        dr.trim();
        
        for (int i = 0; i < dr.length(); i++) {
            int firstind = instr.indexOf(darr[i]);

            String temp = "";
            if (firstind != -1) {
                temp = str[firstind];
            } else
                break;

            int flag = 0;

            for (int j = firstind + 1; j < str.length; j++) {
                if ((temp.equals(str[j])) && (inarr[j]) == darr[i]) {                    
                    flag = 1;
                }
            }
            int count = 0;
            for (int k = 0; k < inarr.length; k++) {
                if (darr[i] == inarr[k]) {
                    count++;
                }
            }
            int count1 = 0;
            for (int k = 0; k < str.length; k++) {
                if (temp.equals(str[k])) {
                    count1++;
                }
            }
            if ((flag == 1 || count == 1) && (count == count1)) {
                result = result + darr[i];
            }

        }
        if (result.equals("")) {
            System.out.println("NA");
        } else
            System.out.println(result);
    }
}

------------------------------------------------------------------------

