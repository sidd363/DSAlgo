package stacks;

import java.util.Stack;

public class redundantBraces {
    public static int braces(String A) {
        char []ch = A.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char c :ch){
            if( c == ')'){
                // check for open braces
                boolean isOperatorFound = false;
                char top = st.pop();
                while(top != '('){
                    if( top == '+' || top == '-'|| top == '/'|| top == '*' ){
                        isOperatorFound = true;
                    }
                    top = st.pop();
                }
                if (isOperatorFound == false){
                    return 1;
                }

            }else {

                st.push(c);

            }
        }

        return 0;
    }
    public static void main(String[] args) {
        System.out.println(braces("(a+(a+b))"));

    }
}
