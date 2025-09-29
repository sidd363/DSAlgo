package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumK {
    public static void findUniqueCombination(int [] arr, int k){
        List<List<Integer>> ans = new ArrayList<>();
        // 1 , 2
        // 3
        Arrays.sort(arr);
        util(arr, k , new ArrayList<Integer>(), ans,  0);


        for(List<Integer> list :ans){
            for(int i : list){
                System.out.print(i+ "\t");
            }
            System.out.println();
        }
    }

    private static void util(int[] arr, int k, ArrayList<Integer> inner,  List<List<Integer>> ans, int index) {
        if(k==0){
            ans.add(new ArrayList<>(inner));
            return;
        }
        if(k<0 || index >= arr.length){
            return;
        }
        for(int i = index; i<arr.length; i++){
            if(i>1 && (arr[i-1] == arr[i])){
                continue;
            }
            inner.add(arr[i]);
            util(arr, k-arr[i], inner, ans, i+1);
            inner.remove(inner.size()-1);

        }

    }

    public static void main(String[] args) {
        int [] arr = {10, 1, 2, 7, 6, 1, 5};

        findUniqueCombination(arr, 8);
        System.out.println("called -- ");
    }
}
