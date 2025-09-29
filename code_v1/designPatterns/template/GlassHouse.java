package designPatterns.template;

public class GlassHouse extends House{
    @Override
    public void createWall() {
        System.out.println("creating wall");
    }

    @Override
    public void createDoor() {
        System.out.println("creating dooorrrr");
    }

}
