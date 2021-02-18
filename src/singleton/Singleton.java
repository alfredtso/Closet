package singleton;

public class Singleton {
    private static Singleton singleInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

}
