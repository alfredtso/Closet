package singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler theBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (theBoiler == null) {
            theBoiler = new ChocolateBoiler();
        }
        return theBoiler;
    }

    // rest of the code
}
