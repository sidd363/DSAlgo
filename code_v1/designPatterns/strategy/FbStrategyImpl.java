package designPatterns.strategy;

public class FbStrategyImpl implements StrategyIntf{
    @Override
    public void sendMessage() {
        System.out.println("sending msg from fb");
    }
}
