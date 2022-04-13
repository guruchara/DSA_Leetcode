Sort Array :

Arryas.sort(nums);

// // ---------------------
// class GFG_solution
// {
// public static void main(String[] args) {
//      String s="gurucharan"    ;
//      System.out.println(s.subSequence(beginIndex, endIndex));
// }
// }

Maximum in Tree :

class Solution{
    public static int findMax(Node root){
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            return Math.max(root.data,Math.max(findMax(root.left),findMax(root.right)));
        }
    }
    public static int findMin(Node root){
         if(root==null)
         {
             return Integer.MAX_VALUE;
         }
         else
         {
                 return Math.min(root.data,Math.min(findMin(root.left),findMin(root.right)));
         }
    }
}

---------------------------------------------------------------------

class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if(node==null) return -1;
        return find(node);
    }
    int find(Node node){
        if(node==null)
        {
            return Integer.MAX_VALUE;
        }
        else
        {
            return Math.min(node.data,Math.min(find(node.left),find(node.right)));
        }
    }
}


--------------------------------------------------------------------

Print Permutations 

class Solution {
    public static void check(String s1,String s2,List<String>l)
    {
        if(s1.length()==0)
        {
             l.add(s2);
             return;
        }
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            String left=s1.substring(0,i);
            String right=s1.substring(i+1);
            String ros=left+right;
            check(ros,ch+s2,l);
        }
    }
    public List<String> find_permutation(String S) {
        List<String>l=new ArrayList<String>();
        check(S,"",l);
        Collections.sort(l);
        return l;
    }
}
--------------------------------------------------------------

//Linked List 

Question :) Occurence of an integer in a Linked List

class Solution
{
    public static int count(Node head, int x)
    {
        int c=0;
        while(head!=null)
        {
            if(head.data==x)
            {
                c++;
            }
            head=head.next;
        }
        return c;
    }
}
------------------------------------------------------------------------------

Length is even or odd 

class GFG
{
    public int check(Node head)
    {
        int c=0;
        while(head!=null)
        {
            c++;
            head=head.next;
        }
        return c;
    }
	int isLengthEvenorOdd(Node head)
	{
	 
	    return check(head)%2==0?0:1;
	}
}

-------------------------------------------------------------------------

Find the Sum of Last N nodes of the Linked List 

class Solution {
    
    //Return the sum of last k nodes
    public int size(Node head)
    {
        int c=0;
        Node curr=head;
        while(curr!=null)
        {
            c++;
            curr=curr.next;
        }
        return c;
    }
    public int summ(Node head)
    {
         int sum=0;
        if(head==null)
        {
            return 0;
        }

        Node curr=head;
        while(curr!=null)
        {
           sum+=curr.data;
           curr=curr.next;
        }
        return sum;
    }
    public int sum(Node head, int k)
    {
        if(head==null)          
        {
            return 0;
        }
          int sz=size(head);
          if(sz==k)
          {
             return summ(head);
          }
          
          Node fast=head;
          int zz=size(head);
          int y=zz-k;
         for(int i=0;i<y;i++)
         {
             fast=fast.next;
         }
         return summ(fast);
    }
}

-------------------------------------------------------------------------------

Ways To Tile A Floor  GFG  problem 


class Solution {
    
   
    public static long mod=(long)1e9+7;
    
    public static Long numberOfWays(int n) { 
        
        
        long dp[]=new long[100001];
        
        dp[1]=1;
        dp[2]=2;
        
        for(int i=3;i<=n;i++)
        {
            dp[i]=(dp[i-1]+dp[i-2])%mod;
        }
        return dp[n];
    }
};

-------------------------------------------------------------------------

Preorder traversel by using recusrsion 

class BinaryTree
{
    
    public static void check(Node node,ArrayList<Integer>l)
    {
        if(node==null)
        {
            return;
        }
          l.add(node.data);
         check(node.left,l);
         check(node.right,l);
    }
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer>l=new ArrayList<Integer>();
        check(root,l);
        return l;
    }

}
----------

Delete Mid element of Stack


class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>st,int sizeOfStack){
         
         
         ArrayList<Integer>l=new ArrayList<Integer>();
         
         
         int x=(st.size()/2)+1;
         for(int i=0;i<x-1;i++) // minus one islie kiya bcz hmne phle ek extra me add kr liya he 
         {
            l.add(st.pop());
         }
          st.pop();
         
         for(int i=l.size()-1;i>=0;i--)
         {
             st.push(l.get(i));
         }
         
    } 
}

-----------------------------------------------------------------------------------------

Maximum diffrenece  // topic Stack

class Solution
{
    public int [] nsl(int a[])
    {
       Stack<Integer>st=new Stack<Integer>();
       int ans[]=new int[a.length];
       
       Arrays.fill(ans,0);
       
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
    public int [] nsr(int a[])
    {
        Stack<Integer>st=new Stack<Integer>();
        
        int ans[]=new int[a.length];
        Arrays.fill(ans,0);
        
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
    int findMaxDiff(int a[], int n)
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
}

------------------------------------------------------------------------------------------

Collect Max Gold from given matrix : 

// by using recursion  I got Time Complexity Exceed 

// recursion solution 

class Solution{
    public static int goldcollect(int a[][],int i,int j, int r,int c)
    {
        
        if(i<0 || j<0 || i==r || c==j)
        {
            return 0;
        }
        
        // if(dp[i][j]!=-1)
        // {
        //     return dp[i][j];
        // }
        //rud right upper diagonal
        int rud=goldcollect(a,i-1,j+1,r,c);
        
        //right  now i am calling in right side 
        int right=goldcollect(a,i,j+1,r,c);
        
        // rdd right down diagonal
        int rdd=goldcollect(a,i+1,j+1,r,c);
        
        int max=Math.max(Math.max(rud,rdd),right);
        
         return max+a[i][j];
    }
    public static int maxgold(int a[][],int r,int c)
    {
        // int dp[][]=new int[r][c];
        
        //  for(int val[]:dp)
        //  {
        //      Arrays.fill(val,-1);
        //  }
         
        int max=0;
        
        for(int i=0;i<a.length;i++){
            
            max=Math.max(max,goldcollect(a,i,0,r,c));
        }
        return max;
    }
    static int maxGold(int n, int m, int M[][])
    {
         int ans=maxgold(M,n,m);
         return ans;
    }
}


// So here I am using Memoiozation All Test Cases Pases

class Solution{
    public static int goldcollect(int a[][],int i,int j, int r,int c,int dp[][])
    {
        
        if(i<0 || j<0 || i==r || c==j)
        {
            return 0;
        }
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        //rud right upper diagonal
        int rud=goldcollect(a,i-1,j+1,r,c,dp);
        
        //right  now i am calling in right side 
        int right=goldcollect(a,i,j+1,r,c,dp);
        
        // rdd right down diagonal
        int rdd=goldcollect(a,i+1,j+1,r,c,dp);
        
        int max=Math.max(Math.max(rud,rdd),right);
        
        return dp[i][j]= max+a[i][j];
    }
    public static int maxgold(int a[][],int r,int c)
    {
        int dp[][]=new int[r][c];
        
         for(int val[]:dp)
         {
             Arrays.fill(val,-1);
         }
         
        int max=0;
        
        for(int i=0;i<a.length;i++){
            
            max=Math.max(max,goldcollect(a,i,0,r,c,dp));
        }
        return max;
    }
    static int maxGold(int n, int m, int M[][])
    {
         int ans=maxgold(M,n,m);
         return ans;
    }
}


----------------------------------------------------------------------------