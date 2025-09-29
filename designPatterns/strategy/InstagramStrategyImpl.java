package designPatterns.strategy;

public class InstagramStrategyImpl implements StrategyIntf{
    @Override
    public void sendMessage() {
        System.out.println("sending msg from instagram");
    }
}
