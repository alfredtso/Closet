package command;

import java.awt.*;

public class ControlPanelTest {
    public static void main(String[] args) {
        SimpleControlPanel panel = new SimpleControlPanel();
        Button button = new Button();
        ButtonOneCommand buttonOne = new ButtonOneCommand(button);

        panel.setCommand(buttonOne);
        panel.buttonWasPressed();
    }
}
