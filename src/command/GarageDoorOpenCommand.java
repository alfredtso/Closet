package command;

public class GarageDoorOpenCommand implements Command {

    public class GarageDoor {

    }

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor gd) {
        this.garageDoor = gd;
    }

    public void execute() {
        /*
        this.garageDoor.up();
        this.garageDoor.lightOn();

         */
        System.out.println("Garage Door is Open");
    }

    @Override
    public void undo() {
        System.out.println("Garage Door is Close");
    }

}
