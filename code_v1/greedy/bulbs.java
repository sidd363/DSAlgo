package greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class bulbs {
   /*
    N light bulbs are connected by a wire.

    Each bulb has a switch associated with it, however due to faulty wiring,
    a switch also changes the state of all the bulbs to the right of current bulb.

    Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

    You can press the same switch multiple times.

    Note : 0 represents the bulb is off and 1 represents the bulb is on.

    */
// 0 1 0 1
//    1 0 1 0
//    1 1 0 1
//    1 1 1 0
//    1 1 1 1
//    1 1
//    1 1

    public static int bulbs(ArrayList<Integer> bulbs) {
        int ans = 0;

        boolean toCount = false;
        int prev = -1;
        for(int bulb : bulbs){
            if(toCount == true && prev != bulb){
                ans++;

            }else if(toCount == false && bulb ==0){
                toCount = true;
                ans++;
            }


            prev = bulb;
        }

        return ans;

    }
    public static void main(String[] args) {
        //A : [ 1, 1, 0, 0, 1, 1, 0, 0, 1 ]
        // 1 1 1 1
        // 1 1 0 0 11 0
//        11 11 00 1
//            11 11 11 0



        System.out.println(bulbs(new ArrayList<>(Arrays.asList(1, 1, 0, 0, 1, 1, 0, 0, 1))));
    }
}
