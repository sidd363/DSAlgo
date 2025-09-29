package designPatterns.strategy;

public class Context {
    StrategyIntf strategy;

    public Context(StrategyIntf s){
        strategy = s;
    }

    public void setStrategy(StrategyIntf strategy) {
        this.strategy = strategy;
    }
    public void execute(){
        strategy.sendMessage();
    }
}
