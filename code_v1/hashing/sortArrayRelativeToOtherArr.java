package hashing;

import java.util.*;
import java.util.stream.Collectors;

public class sortArrayRelativeToOtherArr {

    public static int[] sortA1ByA2(int a1[], int n, int a2[], int m)
    {
        //Your code here
        List<Integer> al = new ArrayList<>();

        Map<Integer, Integer> hm = new HashMap<>();
        for(int i : a1){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        for(int i = 0;i<m ; i++){
            int el = a2[i];
            if(hm.containsKey(el)){
                for(int j = 0; j< hm.get(el); j++){
                    al.add(el);
                }
                hm.remove(el);
            }
        }
        List<Integer> keys = hm.keySet().stream().sorted().collect(Collectors.toList());

        for(int i : keys){
            int el = i;
            if(hm.containsKey(el)){
                for(int j = 0; j< hm.get(el); j++){
                    al.add(el);
                }
                hm.remove(el);
            }
        }
        int l = al.size();
        int j = 0;
        int [] ans = new int[l];

        for (int i : al){
            ans[j++] = i;
        }
        return ans;

    }
    public static void main(String[] args) {
        int a1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int a2[] = {2, 1, 8, 3};

        int [] ans = sortA1ByA2(a1, a1.length, a2, a2.length);

        Arrays.stream(ans).forEach(System.out::println);
    }
}
