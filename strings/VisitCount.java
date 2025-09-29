package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VisitCount {
    public static List<String> subdomainVisits(String[] list) {
        HashMap<String, Integer> hm = new HashMap<>();
        List<String> ans = new ArrayList<>();

        for(String s : list){
            String sub = s.substring(s.indexOf(" ")+1, s.length());

            int count = Integer.valueOf(s.substring(0, s.indexOf(" ")));

            String  [] domainArr = sub.split("\\.");
            String key = domainArr[domainArr.length-1] ;
            hm.put(key, hm.getOrDefault(key, 0)+ count);

            for(int i =domainArr.length-2;i>=0; i-- ){
                key =  domainArr[i]+ "." + key;
                hm.put(key, hm.getOrDefault(key, 0)+ count);

            }


        }

        for(Map.Entry<String, Integer> entry: hm.entrySet()){
            ans.add(entry.getValue()+ " "+entry.getKey());
        }

        return ans;
    }

    public static void main(String[] args) {
        String [] list =  {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> ans =  subdomainVisits(list);

        for(String i : ans){
            System.out.println(i);
        }

    }
}
