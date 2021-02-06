package alltopics;

import java.util.Arrays;

public class alertEmp {
//    public static List<String> alertNames(String[] keyName, String[] keyTime) {
//        List<String> ans = new ArrayList<>();
//        // same hour 3 punch put to ans
//        HashMap<String, List<String>> hm = new HashMap<>();
//        int in = 0;
//        for(String i : keyName){
//            if(hm.containsKey(i)){
//                List<String> tmp = hm.get(i);
//                tmp.add(keyTime[in++]);
//                hm.put(i, tmp);
//            }else{
//                List<String> tmp = new ArrayList<String>();
//                tmp.add(keyTime[in++]);
//                hm.put(i, tmp );
//            }
//        }
//
//        for(Map.Entry<String, List<String>> entry: hm.entrySet()){
//            int tmp = 0;
//            String prev = entry.getValue().get(0);
//            for(int i = 1;i<entry.getValue().size();i= i+1){
//                String curr = entry.getValue().get(i);
//                String[] currHourMin = curr.split(":");
//                String currHour = currHourMin[0];
//                String currMin = currHourMin[1];
//
//                String[] prevHourMin = prev.split(":");
//                String prevHour = prevHourMin[0];
//                String prevMin = prevHourMin[1];
//
//                int hdiff  = Integer.parseInt(currHour) - Integer.parseInt(prevHour);
//
//                if(hdiff <1){
//                    int mdiff  = Integer.parseInt(currMin) - Integer.parseInt(prevMin);
//                    tmp = mdiff;
//                }else if( hdiff==1 ){
//                    int mdiff  = 60-Integer.parseInt(prevMin)+ Integer.parseInt(currMin) ;
//                    if(mdiff>60){
//
//                    }
//                }
//
//
//            }
//
//        }
//
//
//        return ans;
//    }
public static int specialArray(int[] nums) {
    int ans = -1;
    Arrays.sort(nums);
    int l = nums.length;
    //int index = 1;
    int arrIndex = 0;
    for(int i = 0;i<=1000;){
        if(arrIndex>=l){
            break;
        }

        int totalRem = l-arrIndex;
        if(totalRem == i){
            return i;
        }
        if(nums[arrIndex] <= i){
            arrIndex++;
            i = arrIndex;
        }else{
            i++;
        }
        //index++;
    }
    return ans;
}
    public static void main(String[] args) {
        //alertNames (new String[]{"leslie","leslie","leslie","clare","clare","clare","clare"}, new String[]{"13:00","13:20","14:00","18:00","18:51","19:30","19:49"});
        System.out.println(specialArray(new int[]{0,5,0,1,8,3,0,1}));
    }
}
