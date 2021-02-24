package adapter;

// as your client expect a Duck
public class TurkeyAdapter implements Duck{
    // instance variable holding a Turkey
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    // need to implement the Duck interface
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // need to fly 5 times to mimic duck
        turkey.fly();
        turkey.fly();
        turkey.fly();
        turkey.fly();
        turkey.fly();
    }
}
