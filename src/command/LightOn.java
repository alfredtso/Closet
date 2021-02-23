package command;

public class LightOn implements Command {

    private final Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.printf("Lights on !");
        System.out.println(this.light.hashCode());
    }

    @Override
    public void undo() {
        this.light.off();
    }
}
