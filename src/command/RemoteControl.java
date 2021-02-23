package command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        this.undoCommand = new NoCommand();

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command onComm, Command offComm) {
        onCommands[slot] = onComm;
        offCommands[slot] = offComm;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        this.undoCommand = onCommands[slot];
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
        this.undoCommand = offCommands[slot];
    }

    public void undoButtonPressed() {
        this.undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----- Remote Control -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "]" + onCommands[i].getClass().getName()
            + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
