package state;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        // Inappropriate actiosns for this state

    }

    @Override
    public void ejectQuarter() {
        // Inappropriate actiosns for this state

    }

    @Override
    public void turnCrank() {

        // Inappropriate actiosns for this state
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.count > 0) {
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs");
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        }
    }
}
