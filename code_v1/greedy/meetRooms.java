package greedy;

import java.util.Arrays;

public class meetRooms {
    public static int noofrooms(int[] st, int[]end){
        if(st.length ==0 ){
            return 0;
        }
        Arrays.sort(st);
        Arrays.sort(end);

        int max = 1;
        int endMax = end[0];
        int tmp=1;
        int j = 1;
        for(int i = 1;i<st.length && j<end.length;){
            if(st[i] <= end[j-1]){
                tmp++;
                endMax = Math.max(end[i], endMax);
                max = Math.max(tmp, max);
                i++;
            }else{
                tmp--;
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        System.out.println(" max meeting rooms "+noofrooms(arr, dep) );
    }
}
