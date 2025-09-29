package designPatterns.command;

public class Runner {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Invoker invoker = new Invoker();
        invoker.setCommand(new StartFanCommand(fan));
        invoker.invoke();
    }
}
