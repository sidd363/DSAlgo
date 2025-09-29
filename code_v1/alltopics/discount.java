package alltopics;

import java.util.Arrays;
import java.util.Stack;

public class discount {
    public  static int[] finalPrices(int[] prices) {
        int [] ans =new int[ prices.length];

        Stack<Integer> st = new Stack<>();

        for(int j = prices.length-1;j>=0;j--){
            int ele = prices[j];
            if(st.isEmpty()){
                ans[j] = ele;
                st.push(ele);
            }else {
                while(st.size()>0 && st.peek()>ele){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[j] = ele;
                    st.push(ele);
                }else{
                    ans[j] = ele -st.peek();
                    st.push(ele);
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[]{10,11, 12, 13})));
    }
}
