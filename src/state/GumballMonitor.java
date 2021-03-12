package state;

public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Count: " + machine.getCount());
            System.out.println("State: " + machine.getState());
            System.out.println("Location: " + machine.getLocation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
