package design.slidingWindow;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SlidingWindow implements rateLimiter{
    Queue<Long> queue;
    int timeWindow;
    int bucketCapacity;

    public SlidingWindow(int timeWindow, int bucketCapacity) {
        this.timeWindow = timeWindow;
        this.bucketCapacity = bucketCapacity;
        this.queue = new ConcurrentLinkedQueue<>();
    }


    @Override
    public boolean grantAccess() {
        long currentTimeMillis = System.currentTimeMillis();
        checkTimeAndUpdateWindow(currentTimeMillis);

        if(queue.size()< bucketCapacity){
            queue.offer(currentTimeMillis);
            return true;
        }
        return false;
    }

    private void checkTimeAndUpdateWindow(long currentTimeMillis) {
        if(queue.isEmpty()){
            return;
        }
        long topRecordTime = queue.peek();
        int diff = (int)(currentTimeMillis - topRecordTime )/1000;

        while(diff >= timeWindow){
            queue.poll();
            if(queue.isEmpty()){
                break;
            }
            currentTimeMillis = queue.peek();
            diff = (int)(currentTimeMillis - queue.peek() )/1000;
        }


    }
}
