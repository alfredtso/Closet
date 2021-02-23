package command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light light = new Light("Living Room");

        // this only works when Command interface has only one abs method

        System.out.println(remote);
    }
}
