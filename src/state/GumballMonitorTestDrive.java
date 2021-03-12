package state;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String location = "rmi://127.0.0.1/RemoteCall";

        try {
            // Casting necessary as it comes out from rmi as object
            GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location);
            GumballMonitor monitor = new GumballMonitor(machine);
            monitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
