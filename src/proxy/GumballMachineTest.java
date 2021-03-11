package proxy;

public class GumballMachineTest {
    public static void main(String[] args) {
        int count = 0;

        if (args.length < 2) {
            System.out.println("Usage: GumballMachine2 <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachine2 gumballMachine2 = new GumballMachine2(args[0], count);

        GumballMonitor monitor = new GumballMonitor(gumballMachine2);

        monitor.report();
    }
}
