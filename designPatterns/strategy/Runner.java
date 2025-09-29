package designPatterns.strategy;

public class Runner {
    public static void main(String[] args) {
        Context c = new Context(new FbStrategyImpl());
        c.execute();
        c.setStrategy(new InstagramStrategyImpl());
        c.execute();
    }
}
