package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class    Nmeetings {
    public static class pairs{
        int st;
        int et;
        pairs(int end, int start){
            st = start;
            et = end;
        }
        pairs(){

        }
    }
    public static class customsort implements Comparator<pairs>{

        @Override
        public int compare(pairs o1, pairs o2) {
            return o1.et - o2.et;
        }
    }
    static void maxMeetings(int start[], int end[], int n) {
        // add your code here
        pairs[] pa = new pairs[n];
        for(int i = 0;i<n;i++){
           pa[i] = new pairs(end[i], start[i]);
        }
        Arrays.sort(pa, new customsort());
        int i = 0;
        pairs prev = new pairs();
        for (pairs p : pa){
            if(i ==0){
                System.out.print(i+1);
                prev = p;
            }
            if(p.st> prev.et){
                prev = p;
                System.out.print(" "+(i+1));
            }
            i++;
        }
    }

    public static void main(String[] args) {
//        N = 6
//        S[] = {1,3,0,5,8,5}
//        F[] = {2,4,6,7,9,9}
        int [] s = {1,3,0,5,8,5};
        int [] f = {2,4,6,7,9,9};
        maxMeetings(s, f, s.length);

    }
}
