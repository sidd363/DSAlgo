package multithreading;

public class yieldDemo extends Thread{
    public void run(){
        for (int i = 0;i<10;i++){
            System.out.println(" child thread"+i);
            yield();
        }
    }
}
