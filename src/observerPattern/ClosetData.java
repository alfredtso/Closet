package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ClosetData  implements Subject {

   private List<Observer> observers;
   private int dressNumber;

    public ClosetData() {
        observers = new ArrayList<>();
    }
    public int getDress() { return 0;}

    // measurementsChanged()
    public void statusChanged() {
        notifyObservers();
    }

    public void setStatus(int dressNumber) {
        this.dressNumber = dressNumber;
        statusChanged();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers) {
            // push the changes, use update with arg
           // o.update(dressNumber);

            // observer will be notified of the changes and they can implement
            // update in their concrete class to get respective info
            o.update();
        }
    }
}
