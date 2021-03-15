package state;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GumballMachineRemoteTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;

        if (args.length < 2) {
            System.out.println("Usage <name> <inventory>");
            System.exit(1);
        }

        try {
            LocateRegistry.createRegistry(1099);
            System.out.println("Created Registry on port 1099");
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            System.out.println("Set hostname prop to localhost");
            String name = args[0];
            Naming.rebind(name, gumballMachine);
            System.out.println("Bind successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
