package state;

public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State currentState;
    int count = 0;

    public GumballMachine(int numberOfGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        this.count = numberOfGumballs;

    }

    public State getCurrentState() {
        return currentState;
    }

    public int getCount() {
        return count;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    // Define all the actins

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    void releaseBall() {
        System.out.println("Rolling rolling rolling...");
        if (count > 0) {
            count--;
        }
    }

    public State getHasQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
}
