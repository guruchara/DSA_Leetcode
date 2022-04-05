
Leetcode Solution by Gurucharan_rajput

Leetcode 28

class Solution {
    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }
}

----------------------------------------------------

Leetcode 1295

class Solution {
    public int findNumbers(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                c++;
            }
            if (c % 2 == 0) {
                x++;
            }
        }
        return x;
    }
}-----------------------------------------------------

Leetcode 560

class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer ,Integer> map=new HashMap<Integer,Integer>();
        int sum=0;
        map.put(0,1);
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-k))
            {
               ans+=map.get(sum-k);
            } 
            if(map.containsKey(sum))
            {
                map.put(sum,map.get(sum)+1);
            }
            else
            {
              map.put(sum,1);
            }
        }
        return ans;
    }
}

------------------------------------------------------Leetcode 2108

class Solution {
    public static boolean ispalindrome(String x) {
        StringBuffer sb = new StringBuffer();
        sb.append(x);
        sb.reverse();
        String b = sb.toString();
        if (b.equals(x)) {
            return true;
        } else {
            return false;
        }
    }

    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            String res = words[i];
            if (ispalindrome(res) == true) {
                return res;
            }
        }
        return "";
    }
}

------------------------------------------------

Leetcode 58

class Solution {
    public int lengthOfLastWord(String s) {
        String a[] = s.split(" ");
        return (a[a.length - 1]).length();

    }
}

------------------------------------------------------------------------------------

Leetcode 1332

class Solution {
    public int removePalindromeSub(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return 2;
            }
        }
        return 1;
    }
}

-----------------------------------------------

Leetcode 53

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int csum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (csum < 0) {
                csum = 0;
            }
            csum += nums[i];
            max = Math.max(csum, max);
        }
        return max;
    }
}

--------------------------------------------

Leetcode 215

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length - k;
        return nums[n];
    }
}

-------------------------------------------

Leetcode 75

class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}

-----------------------------------------

Leetcode 287

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}

---------------------------------------------------

Leetcode 74

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}

--------------------------------------------------

Leetcode 485

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                c++;
                max = Math.max(c, max);
            } else {
                c = 0;
            }

        }
        return max;
    }
}

--------------------------------------------------

Leetcode 349

Inersatcion of  two Array

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> h1 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            h1.add(nums1[i]);
        }
        Set<Integer> h2 = new HashSet<Integer>();
        for (int j = 0; j < nums2.length; j++) {
            h2.add(nums2[j]);
        }
        List<Integer> l = new ArrayList<Integer>();
        Iterator<Integer> itr = h1.iterator();
        while (itr.hasNext()) {
            int x = itr.next();
            if (h2.contains(x)) {
                l.add(x);
            }
        }

        int a[] = l.stream().mapToInt(x -> x).toArray();
        return a;
    }
}

-----------------------------------------------------

Leetcode 1464

class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max, (nums[i] - 1) * (nums[j] - 1));
            }
        }
        if (max == 1) {
            return 0;
        }
        return max;
    }
}

--------------------------------------------------

Leetcode 581

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int max = nums[0];
        int end = -1;
        for (int i = 1; i < nums.length; i++) {
            if (max > nums[i]) {
                end = i;
            } else {
                max = nums[i];

            }
        }

        int start = 0;
        int min = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > min) {
                start = i;
            } else {
                min = nums[i];
            }
        }
        return end - start + 1;
    }
}

---------------------------------------------------

Leetcode 324

class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int a[] = new int[nums.length];
        int i = 1;
        int n = nums.length;
        int j = nums.length - 1;

        while (i < n) {
            a[i] = nums[j];
            i += 2;
            j--;
        }
        i = 0;
        while (i < n) {
            a[i] = nums[j];
            i += 2;
            j--;
        }
        for (int k = 0; k < nums.length; k++) {
            nums[k] = a[k];
        }
    }
}

----------------------------------------------------

Leetcode 58

class Solution {
    public int lengthOfLastWord(String s) {
        String a[] = s.split(" ");
        return (a[a.length - 1]).length();

    }
}

-----------------------------------------------------

Leetcode 412

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> l = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                l.add("FizzBuzz");
            } else if (i % 3 == 0) {
                l.add("Fizz");
            } else if (i % 5 == 0) {
                l.add("Buzz");
            } else {
                l.add(String.valueOf(i));
            }
        }
        return l;
    }
}

-------------------------------------------------------

Leetcode 2011

class Solution {
    public int finalValueAfterOperations(String[] a) {

        int y = 0;

        for (int i = 0; i < a.length; i++) {
            String res = "";
            res += a[i];
            int j = 0;
            if (res.charAt(0) == '-' && res.charAt(1) == '-'
                    || res.charAt(res.length() - 1) == '-' && res.charAt(res.length() - 2) == '-') {
                y--;
            }
            if (res.charAt(0) == '+' && res.charAt(1) == '+'
                    || res.charAt(res.length() - 1) == '+' && res.charAt(res.length() - 2) == '+')

            {
                y++;
            }
        }
        return y;

    }
}

---------------------------------------------------------

Leetcode 1859

class Solution {
    public String sortSentence(String s) {

        String a[] = s.split(" ");
        String f[] = new String[a.length];
        String res = "";
        for (int i = 0; i < a.length; i++) {

            int x = a[i].charAt(a[i].length() - 1) - '0';
            f[x - 1] = a[i].substring(0, a[i].length() - 1);
        }

        for (int i = 0; i < f.length; i++) {
            res += f[i];

            if (i < a.length - 1) {
                res += " ";
            }
        }
        return res;
    }
}

------------------------------------------------------------

Leetcode 2000 // reverse Prefix of String

class Solution {
    public String reversePrefix(String word, char ch) {

        String res = "";
        int i = 0;

        for (; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                res += word.substring(0, i + 1);
                break;
            }
        }
        if (i == word.length()) {
            return word;
        }
        StringBuffer sb = new StringBuffer(res);
        sb.reverse();

        sb.append(word.substring(i + 1, word.length()));

        String str = sb.toString();
        return str;
    }
}

-------------------------------------------------------------

Leetcode 1876

class Solution {

    static int c = 0;

    public static int substr(String str) {
        HashSet<Character> h = new HashSet<Character>();
        if (str.length() == 3) {
            for (int i = 0; i < str.length(); i++) {
                h.add(str.charAt(i));
            }
        }
        if (h.size() == 3) {
            return 1;
        }
        return 0;
    }

    public int countGoodSubstrings(String s) {
        int max = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            max += substr(s.substring(i, i + 3));
        }
        return max;
    }
}

-------------------------------------------------------------

Leetcode 1455

class Solution {
    public int isPrefixOfWord(String s, String w) {

        if (!s.contains(w)) {
            return -1;
        }

        String a[] = s.split(" ");
        int n = w.length();
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(w)) {
                return i + 1;
            }
            if (a[i].length() > n) {

                if (a[i].substring(0, n).equals(w)) {
                    return i + 1;
                }
            }

        }

        return -1;
    }
}

-----------------------------------------------------------

Leetcode 151

class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        String a[] = s.split("\\s+");

        // StringBuffer sb=new StringBuffer();
        String res = "";

        for (int i = a.length - 1; i >= 0; i--) {

            res += a[i];

            if (i > 0) {
                res += " ";
            }
        }

        return res;
    }
}

---------------------------------------------------------

Leetcode 1408

class Solution {
    public List<String> stringMatching(String[] words) {

        List<String> l = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    if (words[j].contains(words[i])) {
                        l.add(words[i]);
                        break;
                    }
                }
            }
        }
        return l;
    }
}

--------------------------------------------------------------

Leetcode 2062

class Solution {

    public static int check(String str) {
        String w = "aeiou";
        if (str.length() >= 5) {
            HashSet<Character> h = new HashSet<Character>();
            for (int i = 0; i < str.length(); i++) {
                h.add(str.charAt(i));
            }
            int i = 0;
            char a[] = new char[h.size()];
            for (Character ch : h) {
                a[i++] = ch;
            }
            Arrays.sort(a);
            String k = new String(a);

            if (k.contains(w) && k.charAt(k.length() - 1) == 'u') {
                return 1;
            }
        } else {
            return 0;
        }
        return 0;
    }

    public int countVowelSubstrings(String s) {

        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                c += check(s.substring(i, j));
            }
        }
        return c;
    }
}

----------------------------------------------------------

Leetcode 1035

return n%2==0;

-----------------------------------------------------------

leetcode 925

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }

        while (j < typed.length()) {
            if (name.charAt(i - 1) != typed.charAt(j)) {
                return false;
            } else {
                j++;
            }
        }

        return i < name.length() ? false : true;

    }
}

--------------------------------------------------------------

Leetcode 769

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int c = 0; // initial value of chunk is 0 according to question.
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);

            if (max == i) {
                c++;
            }
        }
        return c;
    }
}

-----------------------------------------------------------------

leetcode 724

class Solution {
    public int pivotIndex(int[] nums) {

        int leftsum = 0;
        int rightsum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightsum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {

            rightsum -= nums[i];
            if (leftsum == rightsum) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}

-------------------------------------------------------------

leetcode 153

class Solution {
    public int findMin(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }
}

----------------------------------------------------------

leetcode 1281

class Solution {
    public int subtractProductAndSum(int n) {
        int res = 0;
        int x = 1;
        while (n != 0) {
            x *= n % 10;
            res += n % 10;
            n /= 10;
        }
        return (x - res);
    }
}

-------------------------------------------------------------

leetcode 191

public class Solution {

    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}

------------------------------------------------------------------

leetcode 34

class Solution {
    public int[] searchRange(int[] a, int k) {

        int i = 0;
        int j = a.length - 1;
        int first = -1;

        int v[] = { -1, -1 };

        while (i <= j) {
            int mid = (i + j) / 2;

            if (k > a[mid]) {
                i = mid + 1;
            } else if (k < a[mid]) {
                j = mid - 1;
            } else {
                // first=mid;
                v[0] = mid;
                j = mid - 1;
            }
        }

        System.out.println(first);

        i = 0;
        j = a.length - 1;
        int second = -1;
        while (i <= j) {
            int mid = (i + j) / 2;

            if (k > a[mid]) {
                i = mid + 1;
            } else if (k < a[mid]) {
                j = mid - 1;
            } else {
                // second=mid;
                v[1] = mid;
                i = mid + 1;
            }
        }

        System.out.println(second);
        return v;
    }
}

------------------------------------------------------------------

leetcode 744

class Solution {
    public char nextGreatestLetter(char[] a, char t) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] > t) {
                return a[i];
            }
        }

        return a[0];
    }
}

-----------------------------------------------------------------

leetcode 378

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> l = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                l.add(matrix[i][j]);
            }
        }

        Collections.sort(l);

        return l.get(k - 1);

    }
}

----------------------------------------------------------------

leetcode 1748

class Solution {
    public int sumOfUnique(int[] nums) {

        LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            h.add(nums[i]);
        }

        int sum = 0;

        for (Integer val : h) {
            int c = 0;

            for (int j = 0; j < nums.length; j++) {
                if (val == nums[j]) {
                    c++;
                }
            }
            if (c == 1) {
                sum += val;
            }

        }
        return sum;
    }
}

-------------------------------------------------------------

Leetcode 961

class Solution {
    public int rTimes(int[] nums) {

        LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            h.add(nums[i]);
        }

        for (Integer val : h) {
            int c = 0;
            for (int x : nums) {
                if (val == x) {
                    c++;

                    if (c == 2) {
                        return x;
                    }
                }
            }
        }
        return -1;
    }
}

-------------------------------------------------------------------

Leetcode 1961

class Solution {
    public boolean isPrefixString(String s, String[] words) {

        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i];
            if (res.equals(s)) {
                return true;
            }
        }

        return false;

    }
}

-------------------------------------------------------------------

Leetcode 387

class Solution {
    public int firstUniqChar(String s) {

        LinkedHashSet<Character> h = new LinkedHashSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            h.add(s.charAt(i));
        }

        for (Character val : h) {
            int c = 0;
            int j = -1;
            for (int i = 0; i < s.length(); i++) {
                if (val == s.charAt(i)) {
                    c++;
                    j = i;
                }
            }
            if (c == 1) {
                return j;
            }
        }
        return -1;
    }
}

--------------------------------------------------------------

Leetcode 1941

class Solution {
    public boolean areOccurrencesEqual(String s) {

        char a[] = s.toCharArray();
        Arrays.sort(a);

        HashSet<Character> h = new HashSet<Character>();

        for (int i = 0; i < a.length; i++) {
            h.add(a[i]);
        }

        int v[] = new int[26];
        int c = 0;
        int k = 0;
        for (char ch : h) {
            c = 0;
            for (int i = 0; i < a.length; i++) {
                if (ch == a[i]) {
                    c++;
                }
            }
            v[k++] = c;
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] == c || v[i] == 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}

----------------------------------------------------------------

Leetcode 1207

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            h.add(arr[i]); // 1 2 3
        }

        // 1 1 1 2 2 3

        int v[] = new int[h.size()]; // 3

        int k = 0;

        for (Integer val : h) {
            int c = 0;
            for (int i = 0; i < arr.length; i++) {
                if (val == arr[i]) {
                    c++;
                }
            }
            v[k++] = c;
        }

        Arrays.sort(v);
        int x = 1;
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] != v[i + 1]) {
                x++; // 1 2 3
            }
        }
        return x == v.length;
    }
}

----------------------------------------------------------------

leetcode 647

class Solution {
    public int countSubstrings(String s) {

        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String g = s.substring(i, j + 1);
                if (check(g)) {
                    c++;
                }
            }
        }
        return c;
    }

    public static boolean check(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            char ch = s.charAt(i);
            char lc = s.charAt(j);
            if (ch != lc) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

--------------------------------------------------------------------

leetcode 35

class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }}

    ---------------------------------------------------------------------

print Zig
    Zag Recursion:

public static void pzz(int n) {
    if (n == 0)
      return;
    System.out.print(n + " ");
    pzz(n - 1);
    System.out.print(n + " ");
    pzz(n - 1);
    System.out.print(n + " ");
  }
}

-----------------------------------------------------------------

Leetcode 520

class Solution {
    public boolean detectCapitalUse(String word) {
        String str = word.toUpperCase();
        if (word.equals(word.toLowerCase())) {
            return true;
        }
        String h = word.substring(1, word.length());
        String x = h.toLowerCase();
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' && word.substring(1, word.length()).equals(x)) {
            return true;
        }
        if (word.equals(str)) {
            return true;
        }
        int i = 0;
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                continue;
            } else {
                return false;
            }
        }
        if (i == word.length()) {
            return true;
        }
        return false;
    }
}

---------------------------------------------------------------------

leetcode 2129

class Solution {
    public String capitalizeTitle(String s) {

        String a[] = s.split(" ");
        String res = "";
        int i = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i].length() == 1 || a[i].length() == 2) {
                String v = a[i].toLowerCase();
                res += v;
            } else if (a[i].charAt(0) >= 'A' && a[i].charAt(0) <= 'Z') {
                res += a[i].charAt(0);
                String m = a[i].substring(1, a[i].length());
                String h = m.toLowerCase();
                res += h;
            } else {
                res += (char) (a[i].charAt(0) - 32);
                String m = a[i].substring(1, a[i].length());
                String h = m.toLowerCase();
                res += h;
            }
            if (i < a.length - 1) {
                res += " ";
            }
        }
        return res;
    }
}

--------------------------------------------------------------------

Leetcode 100

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

--------------------------------------------------------------------------------

Leetcode 17

class Solution {
    public static String[] coder = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    ArrayList<String> p = new ArrayList<String>();

    public List<String> letterCombinations(String s) {
        if (s.equals("")) {
            return p;
        } else {
            return check(s);
        }
    }

    public static List<String> check(String s) {
        if (s.length() == 0) {
            ArrayList<String> l = new ArrayList<String>();
            l.add("");
            return l;
        }
        char ch = s.charAt(0);
        String x = s.substring(1);

        List<String> recAns = check(x);
        ArrayList<String> myAns = new ArrayList<>();

        int idx = ch - '0';
        String k = coder[idx];

        for (int i = 0; i < k.length(); i++) {
            char newchar = k.charAt(i);
            for (String m : recAns) {
                myAns.add(newchar + m);
            }
        }
        return myAns;
    }
}

-----------------------------------------------------------------------

leetcode 1952

class Solution {
    public boolean isThree(int n) {

        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        return c == 3 ? true : false;
    }
}

---------------------------------------------------------------------

leetcode 1684

class Solution {
    public int countConsistentStrings(String s, String[] str) {
        int c = 0;
        HashSet<Character> h = new HashSet<Character>();
        HashSet<Character> a = new HashSet<Character>();
        int i = 0;
        for (i = 0; i < s.length(); i++) {
            h.add(s.charAt(i));
        }
        for (i = 0; i < str.length; i++) {
            String x = str[i];
            for (int j = 0; j < x.length(); j++) {
                a.add(x.charAt(j));
            }
            if (h.containsAll(a)) {
                c++;
            }
            a.clear();
        }
        return c;

    }

}

----------------------------------------------------------------------

leetcode 1365

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int a[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    c++;
                }
            }
            a[i] = c;
        }
        return a;
    }
}

-------------------------------------------------------------------

leetcode 1346

class Solution {
    public boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] == 2 * arr[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}

-----------------------------------------------------------------

Leetcode 1358

class Solution {
    public int numberOfSubstrings(String s) {

        int c = 0;
        String k = "abc";
        for (int i = 0; i <= s.length() - 3; i++) {
            for (int j = i; j < s.length() - 2; j++) {
                String str = s.substring(i, j + 3);

                HashSet<Character> h = new HashSet<Character>();

                for (int t = 0; t < str.length(); t++) {
                    h.add(str.charAt(t));
                }
                String res = "";
                for (Character val : h) {
                    res += val;
                }
                char g[] = res.toCharArray();
                Arrays.sort(g);
                String p = new String(g);
                if (p.equals(k)) {
                    c++;
                }
            }
        }
        return c;
    }
}

---------------------------------------------------------------------

Leetcode 1047

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (st.isEmpty() == false && st.peek() == s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        // char res[] = new char[st.size()];

        // int index = st.size()-1;
        // while(!st.isEmpty()){
        // res[index--] = st.pop();
        // }
        StringBuffer sb = new StringBuffer();
        while (st.isEmpty() == false) {
            sb.append(st.pop());
        }

        return new String(sb.reverse());
    }
}

------------------------------------------------------------------------

leetcode 2063

class Solution {
    public long countVowels(String word) {
        long res = 0, sz = word.length();
        String s = "aeiou";
        for (int i = 0; i < sz; ++i)
            if (s.indexOf(word.charAt(i)) != -1)
                res += (i + 1) * (sz - i);

        return res;
    }

}

// public static long check(String s)
// {
// long c=0;
// for(int i=0;i<s.length();i++)
// {
// if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' ||
// s.charAt(i)=='o' || s.charAt(i)=='u')
// {
// c++;
// }
// }
// return c;
// }
// public long countVowels(String word) {
// long c=0;
// for(int i=0;i<word.length();i++)
// {
// for(int j=i;j<word.length();j++)
// {
// c+=check(word.substring(i,j+1));
// }
// }
// return c;
// }

-------------------------------------------------------------------------

Leetcode 1358

class Solution {
    public int numberOfSubstrings(String s) {
        int last[] = { -1, -1, -1 };

        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
            c += 1 + Math.min(last[0], Math.min(last[1], last[2]));
        }
        return c;
    }
}

/*
 * int c=0;
 * String k="abc";
 * for(int i=0;i<=s.length()-3;i++)
 * {
 * for(int j=i;j<s.length()-2;j++)
 * {
 * String str=s.substring(i,j+3);
 * 
 * HashSet<Character>h=new HashSet<Character>();
 * 
 * for(int t=0;t<str.length();t++)
 * {
 * h.add(str.charAt(t));
 * }
 * String res="";
 * for(Character val:h)
 * {
 * res+=val;
 * }
 * char g[]=res.toCharArray();
 * Arrays.sort(g);
 * String p=new String(g);
 * if(p.equals(k))
 * {
 * c++;
 * }
 * }
 * }
 * return c;
 */

---------------------------------------------------------------------

Leetcode 2114

import java.util.*;

class Solution {
    public int mostWordsFound(String[] a) {

        int val = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            String x[] = a[i].split(" ");
            val = Math.max(val, x.length);
        }
        return val;
    }
}

---------------------------------------------------------------------

Leetcode 1305

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public static void check(TreeNode node, List<Integer> l) {
        if (node == null) {
            return;
        }
        check(node.left, l);
        l.add(node.val);
        check(node.right, l);
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l = new ArrayList<Integer>();
        check(root1, l);
        check(root2, l);
        Collections.sort(l);
        return l;
    }
}

----------------------------------------------------------------------

Leetcode 701

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int x) {
        if (root == null) {
            TreeNode node = new TreeNode(x);
            return node;
        }

        if (x > root.val) {
            root.right = insertIntoBST(root.right, x);
        } else {
            root.left = insertIntoBST(root.left, x);
        }
        return root;
    }
}

-------------------------------------------------------------------------

Leetcode 108

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    public TreeNode set(int a[], int i, int j) {
        if (i > j) {
            return null;
        }
        int mid = i + (j - i) / 2;

        TreeNode node = new TreeNode(a[mid]);

        node.left = set(a, i, mid - 1);
        node.right = set(a, mid + 1, j);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return set(nums, 0, nums.length - 1);
    }
}

------------------------------------------------------------------

leetcode 230

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int c = 0;
    int x = Integer.MIN_VALUE;

    public void check(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        check(root.left, k);
        c++;
        if (c == k) {
            x = root.val;
        }
        check(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {

        check(root, k);
        return x;
    }}

    -------------------------------------------------------------------------

    Leetcode 696

    TLE vala
    SBC ke lie:)

    class Solution {
        public static boolean check(String s) {

            int x = 0;
            char a[] = s.toCharArray();
            Arrays.sort(a);
            String p = new String(a);
            StringBuffer sb = new StringBuffer(p);
            sb.reverse();
            String k = sb.toString();

            if (p.equals(s) || s.equals(k)) {
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if (ch == '0') {
                        x++;
                    } else {
                        x--;
                    }
                }
                return x == 0;
            } else {
                return false;
            }
        }

        public int countBinarySubstrings(String s) {
            int c = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i; j < s.length(); j++) {
                    if (check(s.substring(i, j + 1))) {
                        c++;
                    } else {
                        continue;
                    }
                }
            }
            return c;
        }
    }

    ---------------------------------------------------------------------

    leetcode 876

lass Solution{

    public ListNode middleNode(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

-----------------------------------------------------------------------------

leetcode 206

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode forw = curr.next;
            curr.next = prev;

            prev = curr;
            curr = forw;
        }
        return prev;
    }
}

------------------------------------------------------------------------------

leetcode 319

class Solution {
    public int bulbSwitch(int n) {
        if (n == 0) {
            return 0;
        }
        return (int) Math.sqrt(n);
    }
}

--------------------------------------------------------------------------------

leetcode 205

class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for (Integer i = 0; i < s.length(); i++) {
            if (m1.put(s.charAt(i), i) != m2.put(t.charAt(i), i)) {
                return false;
            }
        }
        return true;
    }
}

---------------------------------------------------------------------------------

leetcode 234

class Solution {
    public ListNode midNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // previous node
        ListNode prev = null;
        // current node
        ListNode curr = head;
        // forward node or say next node

        // here check is curr null
        while (curr != null) {
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode mid = midNode(head); // mid of ll
        ListNode newhead = mid.next;
        mid.next = null;
        // similar as mid+1
        newhead = reverse(newhead);

        ListNode c1 = head;
        ListNode c2 = newhead;

        boolean flag = true;

        while (c1 != null && c2 != null) {
            if (c1.val != c2.val) {
                return false;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        newhead = reverse(newhead);
        mid.next = newhead;
        return true;
    }
}

------------------------------------------------------------------------------------

leetcode 61

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int length(ListNode head) {
        int k = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            k++;
        }
        return k;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int len = length(head);
        int rem = k % len;
        while (rem > 0) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }
            curr.next = head;
            prev.next = null;
            head = curr;
            rem--;
        }
        return head;
    }}

    -------------------------------------------------------------------------------

    leetcode 876

    Another Approach:

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    // class Solution {
    // public ListNode middleNode(ListNode head) {
    // // check is head null
    // if(head==null)
    // {
    // return null;
    // }

    // ListNode slow=head;
    // ListNode fast=head;

    // while(fast!=null && fast.next!=null)
    // {
    // slow=slow.next;
    // fast=fast.next.next;
    // }
    // return slow;
    // }
    // }

    class Solution {
        public int sizeofList(ListNode head) {
            int size = 0;
            ListNode curr = head;
            while (curr != null) {
                size++;
                curr = curr.next;
            }
            return size;
        }

        public ListNode getNode(ListNode head, int idx) {
            int Size = sizeofList(head);
            if (Size == 0) {
                return head;
            } else if (idx < 0 || idx >= Size) {
                return null;
            } else {
                ListNode temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp;
            }
        }

        public ListNode middleNode(ListNode head) {
            int Size = sizeofList(head);
            return getNode(head, (Size / 2));

        }
    }

    --------------------------------------------------------------------------

    leetcode 2177

    class Solution {
        public long[] sumOfThree(long n) {
            long a[] = new long[3];
            int c = 0;
            if (n % 3 == 0) {
                c++;
                a[0] = n / 3 - 1;
                a[1] = n / 3;
                a[2] = n / 3 + 1;
            }
            if (c == 1) {
                return a;
            } else {
                long x[] = new long[0];
                return x;
            }
        }
    }

    -------------------------------------------------------------------------------

    Leetcode 70

    Climbing Stairs
    problme solve
    by using
    Two method
    or Approach:

    1)
    Memoiozation Approach:- --------------------------

    // by using memoization this is accepted.
    class Solution {
        public static int check_kro_bhai(int n, int dp[]) {
            if (n <= 1) {
                dp[n] = 1;
                return dp[n];
            }
            if (dp[n] != 0) {
                return dp[n];
            }
            int pre = check_kro_bhai((n - 1), dp);
            int cur = check_kro_bhai((n - 2), dp);
            dp[n] = pre + cur;
            return dp[n];
        }

        public int climbStairs(int n) {
            int dp[] = new int[n + 1];
            int res = check_kro_bhai(n, dp);
            return res;
        }
    }

    ------------- ------------- --------------------------- -------------

    2)

   Tabulation Approach:-

    // by using Tabulation approach.

    class Solution {
        public int climbStairs(int n) {
            if (n <= 2) {
                return n;
            }
            int dp[] = new int[n];
            dp[0] = 1;
            dp[1] = 2;
            for (int i = 2; i < n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n - 1];
        }
    }

    -------------------------------------------------------------------------------

    leetcode 746

    // By using Memoiozation

    class Solution {
        int dp[];

        public int findmin(int a[], int n) {
            if (n <= 1) {
                return a[n];
            }
            if (dp[n] != 0)
                return dp[n];

            int x = findmin(a, n - 1);
            int y = findmin(a, n - 2);
            int z = a[n] + Math.min(x, y);
            dp[n] = z;
            return dp[n];
        }

        public int minCostClimbingStairs(int[] a) {

            int n = a.length;
            dp = new int[n + 1];
            return Math.min(findmin(a, n - 1), findmin(a, n - 2));
        }
    }

    ----------------------------------------------------------------------------

    leetcode 1143

    class Solution {
        public static int check(String s1, String s2, int m, int n, int dp[][]) {
            if (dp[m][n] != 0) {
                return dp[m][n];
            }
            if (m == 0 || n == 0) {
                return dp[m][n] = 0;
            }
            // last character ko check krte rhenge dono strings ke
            if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
                dp[m][n] = 1 + check(s1, s2, m - 1, n - 1, dp);
            } else {
                dp[m][n] = Math.max(check(s1, s2, m - 1, n, dp), check(s1, s2, m, n - 1, dp));
            }
            return dp[m][n];
        }

        public int longestCommonSubsequence(String s1, String s2) {
            int m = s1.length();
            int n = s2.length();
            int dp[][] = new int[m + 1][n + 1];
            return check(s1, s2, m, n, dp);
        }
    }

    ---------------------------------------------------------------------------------

    leetcode 62

    We have three way to solve this problem

    // by using Recursion

    class Solution {
        public int uniquePaths(int m, int n) {
            if (m == 1 || n == 1)
                return 1;
            return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        }
    }

    // solve by using Memoiozation :

    public class Solution {
        public static int check(int m, int n, int dp[][]) {
            if (m == 1 || n == 1) {
                dp[m][n] = 1;
                return dp[m][n];
            }
            if (dp[m][n] == 0)
                dp[m][n] = check(m - 1, n, dp) + check(m, n - 1, dp);
            return dp[m][n];

        }

        public int uniquePaths(int m, int n) {

            int dp[][] = new int[m + 1][n + 1];
            return check(m, n, dp);

        }
}

// solve by Tabulation

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i==0||j==0)
                   dp[i][j] = 1;
                else
                  dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    }
---------------------------------------------------------------------------

leetcode 1539

class Solution {
    public int findKthPositive(int[] arr, int k) {
          int x=1;
        for(int val:arr)
        {
            if(val<=k)
            {
                k++;
            }
        }
        return k;
    }
}
----------------------------------------------------------------------------------

leetcode 2181

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        
        ListNode curr=head.next;
        ListNode temp=head;
        ListNode prev=temp;
            temp=head;
          int sum=0;
        while(curr!=null)
        {
            if(curr.val!=0)
            {
                sum+=curr.val;
            }
            else
            {
                temp.val=sum;
                sum=0;
                temp.next=curr; 
                prev=temp;
               temp=curr;                                
            }
            curr=curr.next;
        }
        prev.next=null;
        return head;
    }
}
------------------------------------------------------------------------------

Leetcode 206  // Reverse Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
    
//     public ListNode reverseList(ListNode head) {
//         if(head==null)
//         {
//             return null;
//         }
//           ListNode prev=null;
//           ListNode curr=head;         
//         ListNode forw=head.next;
//         while(curr!=null)
//         {          
//             forw=curr.next;
//             curr.next=prev;
            
//             prev=curr;
//             curr=forw;            
//         }
//         return prev;
//     }
// }
class Solution {
    
    ListNode th=null;
    ListNode tt=null;    
  public void addFirst(ListNode head)
  {                
      if(th==null)
      {
          th=head;
          tt=head;
      }
      else
      {
          head.next=th;
          th=head;
      }
  }
  public ListNode reverseList(ListNode head) {
      if(head==null)
      {
         return null;
      }
      ListNode curr=head;
      while(curr!=null)
      {
          ListNode forw=curr.next;
          curr.next=null;
          addFirst(curr);
          curr=forw;
      }
      return th;
  }
}

---------------------------------------------------------------------------

leetcode 1290

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
         ListNode curr=head;
        int sum=0;
        while(curr!=null)
        {
            sum=sum*2;
            sum+=curr.val;
            curr=curr.next;
        }
        return sum;
    }
}

-------------------------------------------------------------------------------

leetcode 2185  // Contest  282 Solution 

class Solution {
   
    public int prefixCount(String[] a, String p) {
        
        
        int x=p.length();
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i].length()<p.length())
            {
                continue;
            }
             String s=a[i];
            int j=0;
            String str=s.substring(j,j+x);
            if(p.equals(str))
            {
                c++;
            }
        }
        return c;
    }
}

---------------------------------------------------------------------------------

leetcode 2186

class Solution {
    public int minSteps(String s, String t) {
         int count = 0;
 
     
        int chars[] = new int[26];
 
      
        for (int i = 0; i < s.length(); i++)
            chars[s.charAt(i) - 'a']++;       
 

        for (int i = 0; i < t.length(); i++)
        {
            chars[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; ++i)
        {
          if(chars[i] != 0)
          {
            count+= Math.abs(chars[i]);
          }
        }
        return count;
    }
}

----------------------------------------------------------------------------------

leetcode 147  // Insertion Sort

class Solution {
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer>l=new ArrayList<Integer>();
        
        ListNode curr=head;
        while(curr!=null)
        {
            l.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(l);
        
        ListNode Simple=new ListNode(0);
        ListNode idea=Simple;
        
        for(int i=0;i<l.size();i++)
        {
            idea.next=new ListNode(l.get(i));
            idea=idea.next;
        }
        return Simple.next;
    }
}

------------------------------------------------------------------------------

leetcode 771

class Solution {
    public int numJewelsInStones(String s1, String s2) {
        int[] count = new int[128];
        for (char c : s2.toCharArray())
          count[c]++;
        int ans = 0;
        for (char c : s1.toCharArray())
            ans += count[c];
        return ans;
    }
} 

----------------------------------------------------------------------------------

leetcode 771  // alternate solution

class Solution {
    public int numJewelsInStones(String s1, String s2) {
        
        int c=0;
        for(int i=0;i<s2.length();i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                if(s2.charAt(i)==s1.charAt(j))
                {
                  c++;   
                }                
            }
        }
        return c;
    }
} 

---------------------------------------------------------------------------------

leetcode 2095  Delete mid of Linked List


class Solution {
    public static ListNode middle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.next;
    }
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return null;
        }
        ListNode curr=head;
        ListNode mid=middle(head);
        while(curr!=null)
        {
            if(curr.next==mid)
            {
                curr.next=mid.next;
                break;
            }
            curr=curr.next;
        }
        return head;
    }
}

-------------------------------------------------------------------------------------------------------------

leetcode 20 valid Paremthethis

class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<Character>();
          
          for(int i=0;i<s.length();i++)          
          {

              char ch=s.charAt(i);              
             if(ch=='{' || ch=='[' || ch=='(')
             {
              st.push(ch);
              }
             else if(st.size()==0)
             {
                 return false;
             }
             else  if(st.peek()!='(' && ch==')')
              {
                  return false;
              }
              else if(st.peek()!='{' && ch=='}')
              {
              return false;
              }
              else if(st.peek()!='[' && ch==']')
              {
                  return false;
              }
              else
              {
                  st.pop();
              }
          } 
        return st.size()==0;   
       
    }
}

---------------------------------------------------------------------------------------

Leetcode 496  // Next Greater Element in right

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        // nums1 just like similar query  and nums2 like  elemenets array.
        int ans1[]=new int[nums1.length];
        
        Stack<Integer>st=new Stack<>();// it stores the indexes
        
        int ans[]=new int[nums2.length];
        Arrays.fill(ans,-1);
        int i=0;
        for(i=0;i<nums2.length;i++)
        {
            while(st.size()!=0 && nums2[st.peek()]<nums2[i])
            {
                int idx=st.pop();
                ans[idx]=nums2[i];
            }
            st.push(i);
        }
        
        HashMap<Integer,Integer>hs=new HashMap<Integer,Integer>();
        
        for(i=0;i<nums2.length;i++)
        {
            hs.put(nums2[i],ans[i]);
        }
        
        for(i=0;i<nums1.length;i++)
        {
            ans1[i]=hs.get(nums1[i]);
        }
        return ans1;
    }
}

------------------------------------------------------------------------------------

leetcode 416  // equal partition sum

class Solution {
    
    public boolean subset(int arr[], boolean dp[][])
    {
        for(int i = 0; i<dp.length; i++){
            for(int j = 0; j<dp[0].length; j++){
                if(j == 0)
                    dp[i][j] = true;
                else if(i == 0)
                    dp[i][j] = false;
                else{
                    //real game
                    boolean notPlayed = dp[i-1][j];

                    boolean played = false;
                    if(j - arr[i-1] >= 0){
                        played = dp[i-1][j-arr[i-1]];
                    }

                    dp[i][j] = played || notPlayed;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public boolean canPartition(int[] a)
     {       
        int sum=0;
        int n=a.length;

        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }

        if(sum%2!=0)
        {
            return false;
        }
        else
        {
            int tar=sum/2;
            boolean dp[][]=new boolean[n+1][tar+1];

            return subset(a,dp);
        }
    }
}

--------------------------------------------------------------------------------------

leetcode 1019 // find next node in right of linked List 

public static int [] nextinlinkedlist(ListNode head)
{
    ListNode curr=head;
   
    ArrayList<Integer>l=new ArrayList<>();

    for(ListNode head ; head!=null ;head=head.next)
    {
        l.add(head.val);
    }

    Stack<Integer>st=new Stack<>();

     int n=l.size();

     int ans[]=new int[n];

     for(int i=0;i<n;i++)
     {
        while(st.size()!=0 && a[st.peek()]<a[i])
        {
            int idx=st.pop();
            ans[idx]=a[i];
        }
        st.push(i);
     }
     return  ans;
}

------------------------------------------------------------------------------

leetcode 1424  // diagonal traverse ii 

class Solution {
    
    public class pair
        {
            int i;
            int sum;
            int j;
        
            pair()
            {
                
            }
            
            pair(int i,int j,int sum)
            {
                this.i=i;
                this.j=j;
                this.sum=sum;
            }            
            
        }
        public int calculate(List<List<Integer>> nums)
        {
            int size=0;
            for(List<Integer>l:nums)
            {
                size+=l.size();
            }
            return size;
        }
    
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        
        
        int size=calculate(nums);
        int ans[]=new int[size];
        
        pair arr[]=new pair[size];
        int idx=0;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=0;j<nums.get(i).size();j++)
            {
                pair temp=new pair(i,j,i+j);
                arr[idx++]=temp;
            }
        }
       // sort arr 
        Arrays.sort(arr,(a,b)->
                    {
                        if(a.sum!=b.sum)
                        {
                            // increasing order
                            return a.sum-b.sum;
                        }
                        else
                        {
                            //decreasing order
                            return b.i-a.i;
                        }
                    });
        
        idx=0;
        for(int i=0;i<size;i++)
        {
            pair curr=arr[i];
            
            ans[idx++]=nums.get(curr.i).get(curr.j);
        }
        return ans;
    }
}

-------------------------------------------------------------------------------------------------

leetcode 224  // Basic calculator  // Hard tag problem

class Solution {
    public boolean isdigits(char ch)
    {
        if(ch>='0' && ch<='9')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int calculate(String s) {
        
        
        int sum=0;
        int sign=1;
        Stack<Integer>st=new Stack<>();
        
        
        for(int i=0;i<s.length();i++)
        {

            char ch=s.charAt(i);
            
            if(isdigits(ch))
            {             
                  int val=0;
                while(i<s.length() && isdigits(s.charAt(i)))
                {
                    val=val*10+(int)(s.charAt(i)-'0');
                    i++;
                }
                i--;
                val=val*sign;
                sign=1;
                sum+=val;
            }
            else if(ch=='(')
            {
                st.push(sum);
                st.push(sign);
                sum=0;
                sign=1;                
            }
            else if(ch==')')
            {
                sum*=st.pop();
                sum+=st.pop();
            }
            else if(ch=='-')                
            {
                sign*=-1;
            }           
        }
        return sum;
    }
}

-----------------------------------------------------------------------------------------------

leetcode 2169

class Solution {
    public int countOperations(int a, int b) {
        
        int c=0;
        
        while(a!=0 && b!=0)
        {
            if(a>b)
            {
                a-=b;
            }
            else
            {
                b-=a;
            }
            c++;
        }
        return c;
    }
}

----------------------------------------------------------------------------------------

leetcode 227 

class Solution {
    public boolean checkdigit(char ch)
    {
        if(ch>='0' && ch<='9')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int calculate(String s) {
        char sign='+';
        
        Stack<Integer>st=new Stack<>();
        
         for(int i=0;i<s.length();i++)
         {
             char ch=s.charAt(i);
             
             if(checkdigit(ch))
             {
                 int val=0;
                 while(i<s.length() && checkdigit(s.charAt(i)))
                 {
                     val=val*10+(s.charAt(i)-'0');
                     i++;                     
                 } 
                 i--;
                 
                 if(sign=='+'){
                     st.push(val);
                 }
                 else if(sign=='-')
                 {
                     st.push(-val);
                 }
                 else if(sign=='*')
                 {
                     int x=st.pop();
                     int ans=x*val;
                     st.push(ans);
                 }
                 else if(sign=='/')
                 {
                     int x=st.pop();
                     int ans=x/val;
                     st.push(ans);
                 }
             }
             else if(ch!=' ')
             { 
                 sign=ch;
             }
         }
         int sum=0;
        while(st.size()!=0)
        {
            sum+=st.pop();
        }
        return sum;
    }
}

-----------------------------------------------------------------------------------------

Leetcode 236 

//aman sir approach 
// approach : 
// find the noderoottopath for both values p and q after that we we comparing both from the ending values
// if any value not match then we will break the while loop and return LCA before returing this we assign 
// nodetopath of value p 
// return lca
class Solution {
    public ArrayList<TreeNode> guru(TreeNode node,int x)
    {
        if(node==null)
        {
            ArrayList<TreeNode>l=new ArrayList<>();
            return l;
        }
        
        if(node.val==x)
        {
            ArrayList<TreeNode>l=new ArrayList<TreeNode>();
            l.add(node);
            return l;
        }
        
        ArrayList<TreeNode>lans=guru(node.left,x);
        if(lans.size()>0)
        {
            lans.add(node);
            return lans;
        }
        
        ArrayList<TreeNode>rans=guru(node.right,x);        
        if(rans.size()>0)
        {
            rans.add(node);
            return rans;
        }
        
        return new ArrayList<TreeNode>();
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList<TreeNode>p2r=guru(root,p.val);
        ArrayList<TreeNode>q2r=guru(root,q.val);
        
        int i=p2r.size()-1;
        int j=q2r.size()-1;
        
        TreeNode LCA=null;
        while(i>=0 && j>=0)
        {
            // through the get we get node bcz make ArrayList of nodes and if i write p2r.get(i).val ..
            if(p2r.get(i).val!=q2r.get(j).val)            
            {
              // here we break if not match bcz lca's rule                 
                break;
            }
            // we already assign null in begining of the code 
            LCA=p2r.get(i);           
            // here required both things diff. bcz may be a chance left only one child 
            // whereas right have more one child so...
            i--;            
            j--;
        }
        // question Tag : Amazon, Sprikrl, all PBC ..  :) 
        return LCA;
    }
}

-----------------------------------------------------------------------------------------
// by using another approach 
class Solution
{
public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        //base case
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //result
        if(left == null) {
            return right;
        }
        else if(right == null) {
            return left;
        }
        else { //both left and right are not null, we found our result
            return root;
        }
   }
}

----------------------------------------------------------------------------------------

leetcode 257

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void check(TreeNode node,List<String>l,String path)
    {
        if(node.left == null && node.right ==null)
        {
            l.add(path + node.val);            
        }
        
       
        if(node.left!=null)
        {
           check(node.left,l,path+node.val+"->");    
        }
        
        if(node.right!=null)
        {
           check(node.right,l,path+node.val+"->");    
        }        
    }
    public List<String> binaryTreePaths(TreeNode node) {
        if(node==null)
        {
            return new ArrayList<String>();
        }        
        ArrayList<String>l=new ArrayList<String>();
        String path="";
        check(node,l,path);
        return l;
    }
}

-------------------------------------------------------------------------------------------

leetcode 81  // search in array II 

class Solution {
    public boolean search(int[] a, int x){
        for(int val:a)
        {
            if(val==x)
            {
                return true;
            }
        }
        return false;
    }
}

-------------------------------------------------------------------------------------------

leetcode 1008

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int idx=0;
    
    public TreeNode PreTra(int pre[],int lh,int rh)
    {
        if(idx>=pre.length||pre[idx]<lh || pre[idx]>rh)
        {
            return null;
        }
        
        // creating new node
        TreeNode node=new TreeNode(pre[idx++]);
        node.left=PreTra(pre,lh,node.val);
        node.right=PreTra(pre,node.val,rh);
        
        return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        
        int lh=-(int)1e9-1;
        
        int rh=(int)1e9+1;
        
        return PreTra(preorder,lh,rh);
    } 
}

----------------------------------------------------------------------------------------------------------

leetcode 102  // level order traversal by using queue 

class Solution {
    public List<List<Integer>> levelOrder(TreeNode node) {
        
        if(node==null)
        {
            return new ArrayList<>();
        }
        List<List<Integer>>l=new ArrayList<>();
        
        
        
        Queue<TreeNode>q=new ArrayDeque<>();
        
        q.add(node);
        
        while(q.size()>0)
        {
            int c=q.size();
        
             List<Integer>ls=new ArrayList<>();
            for(int i=0;i<c;i++)
            {
                node=q.remove();
                ls.add(node.val);
                
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            l.add(ls);
        }
        
        return l;
    }
}

-------------------------------------------------------------------------------------------------------------

leetcode 107   // level order traversal II

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode node) {
  
        if(node==null)
        {
            return new ArrayList<>();
        }
        List<List<Integer>>l=new ArrayList<>();                
        
        Queue<TreeNode>q=new ArrayDeque<>();
        
        q.add(node);
        
        while(q.size()>0)
        {
            int c=q.size();
        
             List<Integer>ls=new ArrayList<>();
            for(int i=0;i<c;i++)
            {
                node=q.remove();
                ls.add(node.val);
                
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            // st.push(ls);
            l.add(ls);
        }
        
        System.out.println(l);
        List<List<Integer>>lk=new ArrayList<>();
        
        for(int i=l.size()-1;i>=0;i--)
        {
            lk.add(l.get(i));
        }
        return lk;
    }
}

-------------------------------------------------------------------------------------------------------------------

leetcode 637  // avg of all level ordering elements

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode node) {
        
        if(node==null)
        {
            return new ArrayList<Double>();
        }
        
        Queue<TreeNode>q=new ArrayDeque<>();
        
        q.add(node);
        
        List<Double>p=new ArrayList<>();
        
        while(q.size()>0)
        {
            int c=q.size();
            
            List<Integer>l=new ArrayList<>();
            
            for(int i=0;i<c;i++)
            {
                node=q.remove();
                
                l.add(node.val);
                
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            
            long sum=0;
            for(int val:l)
            {
                sum+=val;
            }
            double x=(double)sum/l.size();
            p.add(x);
        }
        return p;
    }
}

----------------------------------------------------------------------------------------------------------------------

leetcode 515  // find max in each rows

class Solution {
    public List<Integer> largestValues(TreeNode node) {
        
        if(node==null)
        {
           return new ArrayList<Integer>();
        }
        Queue<TreeNode>q=new ArrayDeque<>();
        q.add(node);
        
        ArrayList<Integer>lm=new ArrayList<>();
        
        while(q.size()>0)
        {            
            int c=q.size();            
            
            ArrayList<Integer>l=new ArrayList<>();
            for(int i=0;i<c;i++)
            {
                node=q.remove();
                l.add(node.val);
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                
                if(node.right!=null)
                {
                    q.add(node.right);
                }                
            }
            int max=Integer.MIN_VALUE;
           for(int val:l)
           {
               max=Math.max(max,val);
           }
            lm.add(max);
        }
        return lm;
    }
}

-------------------------------------------------------------------------------------------------------------------

leetcode 199  // right side view of binary tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode node) {
        
        if(node==null)
        {
           return new ArrayList<Integer>();
        }
        Queue<TreeNode>q=new ArrayDeque<>();
        q.add(node);
        
        ArrayList<Integer>lm=new ArrayList<>();
         
        while(q.size()>0)
        {
            int c=q.size();
            
            ArrayList<Integer>l=new ArrayList<>();
            for(int i=0;i<c;i++)
            {
                node=q.remove();
                l.add(node.val);    
                                
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            lm.add(l.get(l.size()-1));
        }
        return lm;
    }
}

-----------------------------------------------------------------------------------------------------------------------------

leetcode 1609 // Even Odd Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode node) {
          
         Queue<TreeNode>q=new ArrayDeque<>();
           q.add(node);
            
            // boolean flag=false;
       ArrayList<Boolean>flag=new ArrayList<>();
      
           ArrayList<Integer>lm=new ArrayList<Integer>();
         int lvl=0;
      
        while(q.size()>0)
        {
            int k=q.size();              
            ArrayList<Integer>l=new ArrayList<>();
            for(int i=0;i<k;i++)
            {                          
                node=q.remove();            
                l.add(node.val);  
               
                if(node.left!=null)
                {
                    q.add(node.left);
                }
               
                if(node.right!=null)
                {
                    q.add(node.right);
                }                                
            }
          lvl++;
          
          
          int c=0;
          if(lvl%2==0)
          {
             for(int i=0;i<l.size();i++)
             {
                if(l.get(i)%2!=0)
                {
                   c++;
                }
             }
            if(l.size()!=c)
            {
                flag.add(false);
            }
            else
            {
               flag.add(true);
            }
          }          
          else 
          {
            int x=0;
             for(int i=0;i<l.size();i++)
             {
                 if(l.get(i)%2==0)
                 {
                    x++;
                 }
             }
            if(l.size()!=x)
            {
              flag.add(false);
            }
            else
            {
                flag.add(true);
            }
          }
          
        } 
        
        if(flag.contains(false))
        {
          return false;
        }
        else
       {
           return true;
       }
    }
}

--------------------------------

Leetcode 1609

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode node) {
          
         Queue<TreeNode>q=new ArrayDeque<>();
           q.add(node);
            
            // boolean flag=false;
       ArrayList<Boolean>flag=new ArrayList<>();
      
           ArrayList<Integer>lm=new ArrayList<Integer>();
         int lvl=-1;
      
        while(q.size()>0)
        {
            lvl++;
            int k=q.size();              
            ArrayList<Integer>l=new ArrayList<>();
            // int prev=-1;
            for(int i=0;i<k;i++)
            {                          
                node=q.remove(); 
                // if(node.val%2)
                l.add(node.val);  
               
                if(node.left!=null)
                {
                    q.add(node.left);
                }               
                if(node.right!=null)
                {
                    q.add(node.right);
                }                                
            }          
          // System.out.println(lvl+" "+l);
          
          int c=0;
          if(lvl%2==0)
          {
              int prev=-1;
             for(int i=0;i<l.size();i++)
             {
                 if(l.get(i)<=prev) return false;
                if(l.get(i)%2==0)
                {
                   return false;
                }
                 prev=l.get(i);
             }        
          }          
          else 
          {
            int x=0;
              int prev=Integer.MAX_VALUE;
             for(int i=0;i<l.size();i++)
             {
                 if(l.get(i)>=prev) return false;
                 if(l.get(i)%2!=0)
                 {
                    return false;
                 }
                 prev=l.get(i);
             }           
          }
          
        } 
        
        return true;
        
    }
}

-------------------------------------------------------------------------------------------------------------------------


