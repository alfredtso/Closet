package command;

// This is the client in the class diagram
public class SimpleControlPanel {
    Command slot1;
    public SimpleControlPanel() {}

    public void setCommand(Command command) {
        slot1 = command;
    }

    public void buttonWasPressed() {
        slot1.execute();
    }
}
