package composite;

public abstract class MenuComponent {
    public abstract String getName();
    public abstract String getDescription();
    public abstract double getPrice();
    public abstract boolean isVegetarian();
    public abstract void print();


    // Composite should implement these
    public void add(MenuComponent c) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent c) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
}
