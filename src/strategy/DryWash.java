package strategy;

public class DryWash implements WashBehaviour {
    @Override
    public void lastWashed() {
        System.out.println("Wash if weared after change of season");
    }
}
