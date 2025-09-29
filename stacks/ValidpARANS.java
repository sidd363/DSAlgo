package stacks;

import java.util.Stack;

public class ValidpARANS {
    public static boolean isValidParenthesis(String expression) {
        // Write your code here.
        Stack<Character> st = new Stack<>();
        for(int i = expression.length()-1; i>=0;i--){
            char curr = expression.charAt(i);

            if(st.isEmpty()){
                if(curr == '(' || curr == '[' || curr == '{'  ){
                    return false;
                }
                st.push(curr);
            }else{

                char top = st.peek();

                if(curr == '{'){
                    if(top != '}'){
                        return false;
                    }else{
                        st.pop();
                        continue;

                    }
                }
                if(curr == '['){
                    if(top != ']'){
                        return false;
                    }else{
                        st.pop();
                        continue;

                    }
                }
                if(curr == '('){
                    if(top != ')'){
                        return false;
                    }else{
                        st.pop();
                        continue;
                    }
                }
                st.push(curr);
            }
        }

        return st.isEmpty() == true ? true:false;
    }
    public static void main(String[] args) {
        System.out.println(isValidParenthesis(""));
    }
}
