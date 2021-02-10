package decorator;

import java.util.Random;

public abstract class Coat {
    int id;
    public enum Size { S, M, L};
    Size size = Size.S;

    public Coat() {
        this.id = new Random().nextInt(Integer.MAX_VALUE);
    }

    // akin to getDescription in the book
    public int getID() {
        return id;
    }

    // akin to cost()
    public abstract String getDescription();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
