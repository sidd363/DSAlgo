package heaps;

import java.util.*;

public class gadgetsOfDoraland {
    static ArrayList<Integer> TopK(ArrayList<Integer> array, int k)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] > o2[1]){
                    return -1;
                }else if(o1[1] == o2[1]){
                    if(o1[0] > o2[0]){
                        return -1;
                    }else{
                        return 1;
                    }
                }
                return 1;
            }
        });
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(Integer i : array){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            int [] e = new int[2];
            e[0] = entry.getKey();
            e[1] = entry.getValue();
            pq.add(e);
        }
        while (k>0){
            ans.add(pq.poll()[0]);
            k--;
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>( Arrays.asList(1, 1, 2, 2, 3, 3, 3, 4));
        System.out.println(" ans -- "+TopK(a, 2));
    }
}
