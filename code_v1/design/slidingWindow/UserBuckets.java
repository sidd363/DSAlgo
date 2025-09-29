package design.slidingWindow;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UserBuckets {
    Map<Integer, SlidingWindow> hm ;

    UserBuckets(int userId, int bucketCapacity, int timeWindow){
        hm= new HashMap<>();
        this.hm.put(userId, new SlidingWindow(timeWindow, bucketCapacity));
    }

    public boolean assign(int userId){
        boolean isAllowed= hm.get(userId).grantAccess();
        if(isAllowed){
            System.out.println("allowed");
        }else{
            System.out.println("rate limited");
        }
        return isAllowed;
    }
}

