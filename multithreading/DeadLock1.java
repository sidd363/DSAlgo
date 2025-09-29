package multithreading;

public class DeadLock1 implements Runnable{

    @Override
    public void run() {
        System.out.println(" thread of deadlock 1 class is running"+ Thread.currentThread().getName());
        DeadLock2 d2 = new DeadLock2();
        Thread t2 = new Thread(d2, "thread2");
        t2.start();
        /*try {
            t2.start();
            //Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("thread1 has completed its execution" +  Thread.currentThread().getState());

    }
}
