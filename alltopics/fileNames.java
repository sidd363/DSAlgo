package alltopics;

import java.util.Arrays;
import java.util.HashMap;

public class fileNames {
    public static String[] getFolderNames(String[] names) {
        String[] ans = new String[names.length];
        HashMap<String, Integer> hm = new HashMap<>();
        int j = 0;
        for(String i : names){
            if(hm.containsKey(i)){
                int v = hm.get(i);

                v++;
                ans[j] = i+"("+v+")";
                while(hm.containsKey(ans[j])){
                    v++;
                    ans[j] = i+"("+v+")";
                }
                hm.put(ans[j], 0);
                hm.put(i, v);
            }else{
                ans[j] = i;
                hm.put(i, 0);
            }
            j++;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFolderNames(new String[]{"kaido","kaido(1)","kaido(2)","kaido","kaido(1)"})));
    }
}
