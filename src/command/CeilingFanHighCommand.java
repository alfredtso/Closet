package command;

public class CeilingFanHighCommand extends CeilingFanCommand {

    public CeilingFanHighCommand(CeilingFan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        this.setPrevSpeed();
        ceilingFan.high();
    }
}
