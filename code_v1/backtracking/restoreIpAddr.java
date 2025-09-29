package backtracking;

import java.util.ArrayList;
import java.util.List;

public class restoreIpAddr {
    public static List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        util(s, 0, 3, ds, ans);
        return ans;
    }

    private static void util(String s, int index, int limit, List<String> ds, List<String> ans) {
        if(index >s.length()){
            return;
        }
        if(ds.size() == limit+1 && index == s.length()){
            StringBuilder sb = new StringBuilder();
            int indexDS = 0;
            for(String ts : ds){
                sb.append(ts);
                indexDS++;
                if(indexDS != ds.size()){
                    sb.append(".");
                }
            }
            ans.add(sb.toString());
            return;
        }
        for(int i = index; i<s.length();i++){
            if(isValid(s, index, i)){
                ds.add(s.substring(index, i+1));
                util(s, i+1, limit, ds, ans);
                ds.remove(ds.size()-1);
            }else{
                return;
            }

        }

    }

    private static boolean isValid(String s, int index, int i) {
         String tmp = s.substring(index, i+1);
         int tmpInt = Integer.valueOf(tmp);
         String tmpIntstr = String.valueOf(tmpInt);
         if(tmpIntstr.length() == tmp.length() && tmpInt >=0 && tmpInt<=255){
             return true;
         }
         return false;
    }


    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("000"));
    }
}
