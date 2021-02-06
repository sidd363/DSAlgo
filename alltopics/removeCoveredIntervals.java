package alltopics;

import java.util.Arrays;
import java.util.Comparator;

public class removeCoveredIntervals {
    public static int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int count=1;
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0] >=intervals[i-1][0] && intervals[i][1] <=intervals[i-1][1]){
                continue;
            }else if(intervals[i][0] ==intervals[i-1][0] && intervals[i][1] >intervals[i-1][1]){
                continue;
            }else{
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        int [][] grid = {{1,2},{1,4},{3,4}};
        System.out.println( removeCoveredIntervals(grid));
    }
}
