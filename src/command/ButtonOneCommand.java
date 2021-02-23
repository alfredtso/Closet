package command;

import java.awt.*;

public class ButtonOneCommand implements Command{
    Button botton;

    public ButtonOneCommand(Button botton) {
        this.botton = botton;
    }

    public void execute() {
        botton.addNotify();
    }
    public void undo() {botton.removeNotify();}
}
