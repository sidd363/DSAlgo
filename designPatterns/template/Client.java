package designPatterns.template;

public class Client {
    public static void main(String[] args) {
        House h = new GlassHouse();
        h.buildHouse();
    }
}
