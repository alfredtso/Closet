package strategy;

public class WaterWash implements WashBehaviour{

    @Override
    public void lastWashed() {
        System.out.println("Machine Wash okay la");
    }
}
