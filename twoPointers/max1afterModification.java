package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class max1afterModification {
//    Input 1:
//
//    A = [1, 0, 0, 1, 1, 0, 1]
//    B = 1
//    Input 2:
//
//    A = [1, 0, 0, 1, 0, 1, 0, 1, 0, 1]
//    B = 2
    public static int solve(ArrayList<Integer> arr, int k) {
        int diff = Integer.MIN_VALUE;
        int low = 0, high = 0, n = arr.size();
        int zeroUsed = 0;
        while(high<n){
            if(arr.get(high)== 1){
                high++;
            }else{
                if(zeroUsed < k){
                    high++;
                    zeroUsed++;
                }else{
                    while(low<high && zeroUsed >=k){
                        if(arr.get(low) == 0){
                            zeroUsed--;
                        }
                        low++;
                    }
                }
            }

            if((high- low) > diff){
                diff = (high- low);
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 0, 0, 1, 0, 1, 0, 1, 0, 1)), 2));
    }
}
