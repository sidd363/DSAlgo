package stacks;

import java.util.Arrays;
import java.util.Stack;

public class largestRectAreaHistogram {
    public static long getMaxArea(long hist[], long n)  {
        // your code here
        long area = 0;

        //1. find prev smaller element index for every ele
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int  [] prevSmallerIndex = new int[hist.length];
        prevSmallerIndex[0] = -1;
        for(int i = 1;i<n;i++){
            while(!st.empty() && hist[st.peek()]>= hist[i]){
                st.pop();
            }
            int push = st.empty() ? -1 : st.peek();
            prevSmallerIndex[i] = push;
            st.push(i);
        }

        // filling next smaller index array with their indexes
        st.clear();

        st.push(hist.length-1);
        int  [] nextSmallerIndex = new int[hist.length];
        nextSmallerIndex[hist.length-1] =  hist.length ;

        for(int i = hist.length-2;i>=0;i--){
            while(!st.empty() && hist[st.peek()]>= hist[i]){
                st.pop();
            }
            int push = st.empty() ? hist.length  : st.peek();
            nextSmallerIndex[i] = push;
            st.push(i);
        }

//        System.out.println(" prevSmallerIndex "+ Arrays.toString(prevSmallerIndex));
//        System.out.println(" nextSmallerIndex "+ Arrays.toString(nextSmallerIndex));


        for(int i = 0;i<n;i++){
            Long curr = hist[i];
           // System.out.println(" ele "+ curr);
            long tmp =  (i - prevSmallerIndex[i]-1) * hist[i];
            if(tmp>0) {
                curr += tmp;
            }
            //System.out.println(" first "+ curr);
            tmp =  (nextSmallerIndex[i]-i-1 )* hist[i];
            if(tmp>0) {
                curr += tmp;
            }
           // System.out.println(" sec "+ curr);
            area  = Math.max(area, curr);
            //System.out.println(" area "+ area);
        }

        return area;

    }
    public static void main(String[] args) {
        long [] hist = {1,2,3,4,5};
        //long [] hist = {5,4,3,2,1};
        System.out.println(" max area "+ getMaxArea(hist, hist.length));
    }
}
