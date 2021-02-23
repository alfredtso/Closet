package command;

public class Light {
    private String info;

    public Light(String info) {
        this.info = info;
    }

    public void on() {
        System.out.println(info + "'s light has switched on");
    }

    public void off() {
        System.out.println(info + "'s light has switched off");
    }


}
