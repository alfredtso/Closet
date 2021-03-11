package state;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned !");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Turned ... ");
        gumballMachine.setCurrentState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Not available");
    }
}
