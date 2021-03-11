package state;

public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You've inserted a Quarter");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("...");
    }

    @Override
    public void dispense() {
        System.out.println("pay me");
    }
}
