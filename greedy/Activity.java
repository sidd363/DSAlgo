package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Activity  {
    int st;
    int et;

    public Activity(int end, int start) {
        et=end;
        st=start;
    }


    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        int ans =0;
        List<Activity> activities = new ArrayList<>();
        for (int i=0;i<end.length;i++) {
            Activity activity =  new Activity(end[i], start[i]);
            activities.add(activity);
        }
        Collections.sort(activities, new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return  o1.et - o2.et;
            }
        });
        Activity prev = activities.get(0);
        ans = 1;
        for(int i =1;i<activities.size();i++){
            Activity curr = activities.get(i);
            if(curr.st >= prev.et){
                ans++;
                prev =  curr;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        System.out.println(activitySelection(new int[]{17, 91, 41, 80 ,36, 7, 73, 99
        }, new int[]{33 ,101, 66, 104, 56, 28, 99,106}, 8));
    }
}
