package multithreading;

import java.util.List;

public class Producer implements Runnable{

    private final List<Integer> taskList;
    private final int capacity;

    Producer(List<Integer> al, int mc){
        taskList = al;
        capacity = mc;
    }

    @Override
    public void run(){

        int counter = 0;

        while (true) {
            try{
                produce(counter++);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


    }

    private void produce(int counter) throws InterruptedException {
        synchronized (taskList){
            while(taskList.size()== capacity){
                taskList.wait();
            }
            taskList.add(counter);
            System.out.println(" produced :"+counter + " name "+ Thread.currentThread().getName());

        }
    }
}
