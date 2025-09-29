package designPatterns.command;

public class StartFanCommand implements Command{
    Fan fan;
    StartFanCommand(Fan fanObj){
        fan = fanObj;
    }
    @Override
    public void execute() {
        fan.start();
    }
}
