package decorator;

public class Wool extends CoatDecorator{

    public Wool(Coat coat) {
        this.coat = coat;
    }

    @Override
    public String getDescription() {
        return coat.getDescription() + ", Wool";
    }

    public int getID() {
        return coat.getID();
    }
}
