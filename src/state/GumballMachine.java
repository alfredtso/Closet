package state;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State currentState;
    int count = 0;
    String location;

    public GumballMachine(String location, int numberOfGumballs)
    throws RemoteException {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        this.count = numberOfGumballs;
        this.location = location;

    }

    public State getState() {
        return currentState;
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
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
