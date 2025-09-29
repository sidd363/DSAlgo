package designPatterns.template;

public abstract class House {

    //  main final method that provides template for the concrete classes to implement
    final public void buildHouse(){
        createBase();
        createRoof();
        createWall();
        createDoor();
    }

    abstract public void createWall();
    abstract public void createDoor();

    public final void createRoof() {
        System.out.println("creating roof");
    }

    private final void createBase() {
        System.out.println("creating base");
    }
    
}
