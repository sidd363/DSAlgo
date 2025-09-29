package stacks;

import java.util.Stack;

public class lenLongestValidSubstring {
    public static int longValidSubstr(String str){
        int ans = 0;
        int tmp = 0;
        int l = str.length()-1;

        Stack<Character> st = new Stack<>();
        for(int i = l;i>=0;i--){
            char curr = str.charAt(i);
            if(st.isEmpty()){
                if(curr == ')'){
                    st.push(curr);
                }else {
                    tmp = 0;
                }
            }else{
                if(curr == '('){
                    st.pop();
                    tmp = tmp+2;
                    ans = Math.max(ans, tmp);
                }else{
                    st.push(curr);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(" len "+ longValidSubstr(")(()((((()))))))()()(()(()(())()()()))())("));
    }
}
