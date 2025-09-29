package multithreading;

public class DeadlockTest {
    public static void main(String[] args) {
        DeadLock1 d1 = new DeadLock1();
        Thread t1 = new Thread(d1, "thread1");


        System.out.println(" in main function before calling thread1");

        t1.start();

        System.out.println(" in main function after calling thread1");


    }
}
