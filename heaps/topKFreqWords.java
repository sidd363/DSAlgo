package heaps;

import java.util.*;

public class topKFreqWords {
    private static  class Word implements Comparable<Word> {
        String word;
        public Word(String w){
            word = w;
        }
        @Override
        public int compareTo(Word o1) {
            if(this.getWord().length()  < o1.getWord().length()){
               return 1;
            }else if(this.getWord().length()  == o1.getWord().length()){
                if(this.getWord().compareTo(o1.getWord()) >= 1){
                    return 1;
                }else{
                    return -1;
                }
            }
            return -1;
        }

        public String getWord() {
            return word;
        }
    }
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        for(String word :words){
            hm.put(word, hm.getOrDefault(word, 0)+1);
        }

        //LinkedHashMap<String, Integer> lhm = hm.entrySet().stream().sorted((a,b) -> a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue()-a.getValue())
                //.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b)->a,LinkedHashMap::new));

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b)-> a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()) : a.getValue()-b.getValue());
        for(Map.Entry<String, Integer> entry : hm.entrySet()) {
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
//        System.out.println(" lhm "+ lhm);
//
//
//        while(k>0){
//
//        }
//        for(Map.Entry<String, Integer> entry : lhm.entrySet()){
//            if(k>0){
//                ans.add(entry.getKey());
//                k--;
//            }else{
//                return ans;
//            }
//        }


        while(k>0){
            ans.add(0, pq.poll().getKey());
            k--;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));
    }
}
