package greedy;

import java.util.*;

public class reduceSizeArr {
    public static  int minSetSize(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i :arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        LinkedHashMap<Integer, Integer> lm = sortHashmap(hm);
        int s = arr.length;
        List<Integer> res = new ArrayList<>();
        int tmp = 0;
        for(Map.Entry<Integer, Integer> entry : lm.entrySet()){
            if(entry.getValue()+tmp>= s/2 ){
                res.add(entry.getKey());
                break;
            }else{
                res.add(entry.getKey());
                tmp += entry.getValue();
            }
        }
        return res.size();
    }

    private static LinkedHashMap sortHashmap(HashMap<Integer, Integer> hm) {
        List<Map.Entry<Integer, Integer> > al = new ArrayList<>(hm.entrySet());
        Collections.sort(al, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer> entry : al){
            lhm.put(entry.getKey(), entry.getValue());
        }
        return lhm;
    }

    public static  int minSetSizeUsingPriorityQueue(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i :arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((c,d)-> d-c);
        for(int i : hm.keySet()){
            pq.offer(hm.get(i));
        }
        int s = arr.length;
        int res = 0;
        int tmp = 0;
        while (!pq.isEmpty()){
            int ele = pq.poll();
            tmp+= ele;
            res++;
            if(tmp >= s/2){
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(minSetSizeUsingPriorityQueue(new int[]{1000,1000,3,7}));
    }
}
