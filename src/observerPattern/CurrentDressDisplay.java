package observerPattern;

public class CurrentDressDisplay implements Observer, DisplayElement{

    private int dressNumber;
    private ClosetData closetData;

    public CurrentDressDisplay(ClosetData closetData) {
        this.closetData = closetData;
        closetData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Number of dress right now: ");
    }

    @Override
    public void update() {
        // This class will get 'notification' with this update method
        // We will get the info we need ourselves
        this.dressNumber = closetData.getDress();
        display();
    }
}
