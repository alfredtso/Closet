package base;

import strategy.WashBehaviour;
import strategy.WaterWash;

import java.util.ArrayList;
import java.util.List;

public class Dress extends WardrobeItem {

    // program to the interface
    private WashBehaviour washBehaviour;
    private String size;

    public Dress(String des, String size, double price, int year, int month, int day){
        super(des, price, year, month, day);
        setType(WardrobeItemType.DRESS);
        setSize(size);
        this.washBehaviour = new WaterWash();
    }

    public void setWashBehaviour(WashBehaviour washBehaviour) {
        this.washBehaviour = washBehaviour;
    }

    public void performWash() {
        washBehaviour.lastWashed();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Size: " + this.size;
    }

    @Override
    public String toString() {
        performWash();
        return super.toString() + "\n"
                + getDescription() + "\n"
                + "------" + "\n";
    }

    public static void main(String[] args) {
        WardrobeItem[] clothset = new WardrobeItem[2];

        System.out.println("Populate the list using ArrayList and then convert back to Array for acc");
        // Use Array with ArrayList
        List<Dress> winterDress = new ArrayList<>();
        Dress winDress1 = new Dress("White", "L", 1500, 2020, 1, 4);
        Dress winDress2 = new Dress("White", "L", 500, 2020, 1, 4);
        winterDress.add(winDress1);
        winterDress.add(winDress2);

        Dress[] winterDressArray = new Dress[winterDress.size()];
        winterDress.toArray(winterDressArray);
        System.out.println(winterDressArray[1]);

        // Can print everything!
        System.out.println(System.out);

        clothset[0] = new Dress("Black", "M", 1400.0, 2020, 1, 20);
        System.out.println(clothset[0]);
        clothset[1] = new WardrobeItem("Earrings", 500, 2020, 12, 5);

        for (WardrobeItem i: clothset) {
            System.out.println("Item: " + i.getDescription());
        }
    }
}
