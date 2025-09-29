package designPatterns.command;

/**
 * Fan class is a Receiver component in command pattern terminology.
 *
 */
public class Fan {
    void start() {
        System.out.println("Fan Started..");

    }

    void stop() {
        System.out.println("Fan stopped..");

    }
}
