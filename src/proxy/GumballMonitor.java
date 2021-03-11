package proxy;

public class GumballMonitor {
    GumballMachine2 machine;

    public GumballMonitor(GumballMachine2 machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("Gumball Machnine: " + machine.getLocation());
        System.out.println("Current inventory: " + machine.getCount() + " balls");
        System.out.println("Current state: " + machine.getCurrentState());
    }
}
