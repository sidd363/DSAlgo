package alltopics;

import java.util.*;

public class Website {
    String url;
    int count;
    Website(String url, int count){
        this.count = count;
        this.url = url;
    }

    public Website() {

    }

    public List<String> getSortedWeb(List<Website> websites){
        List<String> ans = new ArrayList<>();

        Collections.sort(websites, new SortByFreq());
        for( Website website : websites){
            ans.add(website.url);
        }
        return ans;
    }

    public static class SortByFreq implements Comparator<Website>{
        public int compare(Website w1, Website w2){
            return w2.count - w1.count ;
        }
    }


    public static int subArraySum(int arr[], int n, int sum)
    {
        // add your code here
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int curr = 0;
        int ans = 0;
        hm.put(0, 1);
        for(int i : arr){
            curr += i;
            if(hm.containsKey( curr - sum )){
                ans+= hm.get(curr -sum );
            }
            hm.put(curr, hm.getOrDefault(curr, 0)+1);
        }
        return ans;
    }

    public static void main(String[] args) {
       /* HashMap<String , Integer> lhm = new HashMap<>();
        lhm.put("HK", 3);
        lhm.put("google", 1);
        lhm.put("fb", 1);
        lhm.put("whatsapp", 8);

        Map<String, Integer> sorted = lhm.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry :: getKey , Map.Entry:: getValue,
                        (old, newv)-> old, LinkedHashMap::new));

        System.out.println(" sorted "+ sorted);*/

        System.out.println(" count subarray sum equals to k  "+ subArraySum(new int[]{10, 2, -2, -20, 10},5, -10) );


//        List<Website> webs = new ArrayList<>();
//
//        for(Map.Entry<String, Integer> entry: lhm.entrySet()){
//            webs.add(new Website(entry.getKey(), entry.getValue()));
//        }
//        Website obj = new Website();
//        List<String> ans = obj.getSortedWeb(webs);
//
//        System.out.println(" ans " + ans.size());
//
//        for(String web: ans){
//            System.out.println(web);
//        }

    }

}
