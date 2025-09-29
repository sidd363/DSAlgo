package multithreading;

public class DeadLock2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread2 is running"+ Thread.currentThread().getState() + " name --"+Thread.currentThread().getName() );
        /*try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(" thread2 has completed its execution" +  Thread.currentThread().getState());
    }
}
