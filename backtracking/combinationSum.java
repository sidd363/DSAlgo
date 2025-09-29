package backtracking;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<>();

        util(ans, tmp, 0, target, candidates);


        return ans;

    }

    private static void util(List<List<Integer>> ans, List<Integer> tmp, int index, int remainSum, int[] arr) {

        if(remainSum==0){
            ans.add(new ArrayList<>(tmp));
            return;
        }else if(remainSum <  0 || index >= arr.length){
            return;
        } else {
            //for(int i = index ; i<arr.length;i++){
            if (arr[index] <= remainSum){
                tmp.add(arr[index]);
                util(ans, tmp, index, remainSum - arr[index], arr);
                tmp.remove(tmp.size() - 1);
            }
            util(ans, tmp, index+1, remainSum, arr);

            //}
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
    }
}
