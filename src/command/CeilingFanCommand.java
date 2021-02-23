package command;

public abstract class CeilingFanCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanCommand(CeilingFan fan) {
        this.ceilingFan = fan;
    }

    public void setPrevSpeed() {
        prevSpeed = ceilingFan.getSpeed();
    }

    public void undo() {
        switch (prevSpeed) {
            case 3:
                ceilingFan.high();
                break;
            case 2:
                ceilingFan.medium();
                break;
            case 1:
                ceilingFan.low();
                break;
            case 0:
                ceilingFan.off();
                break;
        }
    }

    abstract public void execute();

}
