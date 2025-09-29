package map;

import java.util.*;
import java.util.stream.Collectors;

public class avoidFlood {
    public static Map<String, Integer> sortByValue( Map<String, Integer> wordCounts) {
        return wordCounts.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public static int[] avoidFlood(int[] rains) {
        int [] ans = new int[rains.length];
        HashMap<String, Integer>  hm = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b)->b.getValue()-a.getValue());

        int j = 0 ;
        for(int i :rains){
            if(i!=0){
                hm.put(i+"", hm.getOrDefault(i+"", 0)+1);
                ans[j]=-1;
            }
            j++;
        }
        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            pq.add(entry);
        }
        System.out.println(hm);
        for(int i = 0;i<rains.length;i++){
            if(rains[i]==0){
                if(pq.size()==0){
                    ans[i]=1;
                    continue;
                }else {
                    Map.Entry<String, Integer> entry = pq.poll();
                    int v = entry.getValue() - 1;
                    if (v > 0) {
                        pq.add(new AbstractMap.SimpleEntry<String, Integer>(entry.getKey(), v));
                    }
                    ans[i] = Integer.valueOf(entry.getKey());
                }
            }
        }
        if(pq.size()>0){
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(" entry "+ pq);
            if(entry.getValue()>1){
                return new int[]{};
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(avoidFlood(new int[]{1,2,0,1,2,0})));
    }
}
