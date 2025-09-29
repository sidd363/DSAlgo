package stacks;

import java.util.Stack;

public class balancedParans {
    public static int solve(String str) {
        int ans = 1;
        char []ch = str.toCharArray();
        Stack<Character>  st = new Stack<>();
        for(char c :ch){
            if(c == '('){
                st.push(c);
            }else {
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    return 0;
                }
            }
        }
        if(!st.isEmpty()){
            return 0;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solve("(()"));

    }
}
