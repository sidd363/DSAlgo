package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class distributeCandies {
    public static int candy(ArrayList<Integer> childs) {
        int ans = 0;
        if(childs.size() == 0){
            return 0;
        }
        Collections.sort(childs);

        int count = 1;
        ans = count;

        for(int i = 1;i<childs.size(); i++){
            if(childs.get(i) != childs.get(i-1)){
                count++;
            }
            ans = ans + count;
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(candy(new ArrayList<>(Arrays.asList(1))));
    }
}
