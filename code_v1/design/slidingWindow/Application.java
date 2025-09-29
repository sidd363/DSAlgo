package design.slidingWindow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        UserBuckets ubc = new UserBuckets(1, 3, 5);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0;i<10; i++){
            executorService.execute(()-> ubc.assign(1));
            Thread.sleep(1000);
        }
        executorService.shutdown();
    }
}
