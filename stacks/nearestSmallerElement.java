package stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nearestSmallerElement {
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        //  [4, 5, 2, 10, 8 ]
        //  [-1, 4, -1, 2, 2]
        Stack<Integer> st = new Stack<>();
        for(int i : A){
            if(st.isEmpty()){
                ans.add(-1);
            }else if(!st.isEmpty()){
                int top = st.peek();
                if(top < i){
                    ans.add(top);
                }else{
                    while( !st.isEmpty() && st.peek() >= i){
                        st.pop();
                    }
                    if(st.empty()){
                        ans.add(-1);
                    }else{
                        ans.add(st.peek());
                    }
                }
            }

            st.push(i);

        }
        return  ans;
    }
    // 4, 5, 2, 10, 8
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 5, 2, 10, 8));
        System.out.println(prevSmaller(arr));
    }
}
