package proxy;
import state.GumballMachine;

class GumballMachine2 extends GumballMachine {
    String location;

    public GumballMachine2(String location, int count) {
        super(count);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

}