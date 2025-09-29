package greedy;

import java.util.Arrays;

public class maxUnits {

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;
        // sort on basis of product of no of boxes and their units
        Arrays.sort(boxTypes, (o2, o1) -> (o1[1] )- (o2[1] ));

        for (int[] i : boxTypes){

            if(truckSize>0){
                if(truckSize - i[0] < 0) {
                    ans+= truckSize * i[1];
                }else{
                    ans+= i[0]*i[1];
                }
                truckSize = truckSize - i[0];

            }else{
                return ans;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}}, 10 ));
    }
}
