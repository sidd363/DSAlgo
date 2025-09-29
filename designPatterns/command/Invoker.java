package designPatterns.command;

public class Invoker {
    Command cmd;

    //Set the command in runtime to trigger.
   // THIS IS dependency inversion of solid priciple
    public void setCommand(Command cmd){
        this.cmd = cmd;
    }

    public void invoke(){
        cmd.execute();
    }
}
