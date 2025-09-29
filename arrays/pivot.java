package arrays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class pivot {
    public static int pivotInteger(int n) {
        int ans = -1;
        int sum = (n*(n+1))/2;
        int tsum =0;
        for(int i =1;i<=n;i++){
            tsum+= i;
            if(sum == tsum){
                return i;
            }
            sum = sum - i;
        }
        return ans;
    }
    public static void main(String[] args) {
        //System.out.println(pivotInteger(4));
        System.out.println(appendCharacters("z", "abcde"));
    }

    /*You are given two strings s and t consisting of only lowercase English letters.

    Return the minimum number of characters that need to be
     appended to the end of s so that t becomes a subsequence of s.

    A subsequence is a string that can be derived from another string
    by deleting some or no characters without changing the order of the remaining characters.
    */
    public static int appendCharacters(String s, String t) {
        //s = "coaching", t = "coding"
        int maxMathchedInOrder = f(0, 0, s, t);

        return t.length()-maxMathchedInOrder;
    }

    public  static  int f(int index1, int index2,String  s ,String t){
        if(index1 == s.length() || index2 == t.length()){
            return 0;
        }
        if(s.charAt(index1) == t.charAt(index2)){
            return 1+ f(index1+1, index2 +1, s, t);
        }else{
            return f(index1+1, index2, s, t);
        }
    }

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public static ListNode removeNodes(ListNode head) {
        ListNode  tmp = head;
        Stack<Integer> st = new Stack<>();
        Deque<Integer> de = new ArrayDeque<>();
        return tmp;
    }
}
