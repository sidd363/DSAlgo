package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTng {

    public static List<List<Integer>> generate(int numRows) {
//                1
//                11
//                121
             // 1331
        // 1 6 6 1
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1;i<= numRows;i++){

            List<Integer> li = new ArrayList<>();
            if(i == 1){
                li.add(1);
                ans.add(li);
                continue;
            }

            if(i == 2){
                li.add(1);
                li.add(1);
                ans.add(li);
                continue;

            }
            List<Integer> prev = ans.get(i-2);
            for(int j = 0;j<i;j++){
                //j-1 j
                if(j==0 || j==i-1){
                    li.add(1);
                }else{
                    li.add(prev.get(j-1) + prev.get(j) );
                }

            }
            ans.add(li);

        }
        return  ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = generate(5);
        for(List<Integer> li : ans){
            for(int i:li){
                System.out.print(i+"\t");
            }
            System.out.println();

        }
    }
}
