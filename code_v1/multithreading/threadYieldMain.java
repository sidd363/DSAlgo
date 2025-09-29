package multithreading;

public class threadYieldMain {
    public static void main(String[] args) {
        yieldDemo t = new yieldDemo();
        t.start();
        for (int i =0;i<10;i++){
            System.out.println("  in main "+i);
        }
    }
}
