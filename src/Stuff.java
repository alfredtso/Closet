import java.util.Random;

public abstract class Stuff {
    private int id;
    public Stuff() {
        this.id = new Random().nextInt(Integer.MAX_VALUE);
    }

    public abstract String getDescription();
    public int getId() {
        return id;
    }
}
