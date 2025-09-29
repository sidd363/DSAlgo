package alltopics;

import java.util.Stack;

public class minInsertions {
    public  static int minInsertions(String s) {
        int ans = 0;

        int r = 0;
        int rn = 0;
        char []ca = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i =0;  i<ca.length;  i++ ){
            char c = ca[i];

            if(c=='('){
                st.push(c);
                if(rn==1){
                    ans++;
                    rn = 0;
                    st.pop();
                }
            }else{
                if(st.isEmpty()){
                    r++;
                }else{
                    rn++;
                    if(rn == 2){
                        st.pop();
                        rn =0;
                    }
                }
            }
        }

        if(st.size()> 0 && rn ==0){
            ans+= st.size()*2;
        }
        if(rn==1){
            ans+= st.size()*2-1;
        }

        if(r>0){
            ans += r/2;
            if(r%2==1){
                ans+=2;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(" min insertions required "+ minInsertions("))(()("));
    }
}
