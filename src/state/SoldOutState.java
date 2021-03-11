package state;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sold out ...");
        this.ejectQuarter();
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejecting quarter ...");
    }

    @Override
    public void turnCrank() {
        // not ava
    }

    @Override
    public void dispense() {
        // not ava
    }
}
