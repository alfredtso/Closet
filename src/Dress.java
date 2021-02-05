import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dress extends Items {

    // program to the interface
    private WashBehaviour washBehaviour;
    private SizeOfDress size;

    public Dress(String des, SizeOfDress size, double price, int year, int month, int day){
        super(des, price, year, month, day);
        setType(Wardrobe.Dress);
        setSize(size);
        this.washBehaviour = new DryWash();
    }

    public void performWash() {
        washBehaviour.lastWashed();
    }

    public SizeOfDress getSize() {
        return size;
    }

    public void setSize(SizeOfDress size) {
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
        Items[] clothset = new Items[2];

        System.out.println("Populate the list using ArrayList and then convert back to Array for acc");
        // Use Array with ArrayList
        List<Dress> winterDress = new ArrayList<>();
        Dress winDress1 = new Dress("White", SizeOfDress.L, 1500, 2020, 1, 4);
        Dress winDress2 = new Dress("White", SizeOfDress.L, 500, 2020, 1, 4);
        winterDress.add(winDress1);
        winterDress.add(winDress2);

        Dress[] winterDressArray = new Dress[winterDress.size()];
        winterDress.toArray(winterDressArray);
        System.out.println(winterDressArray[1]);

        // Can print everything!
        System.out.println(System.out);

        clothset[0] = new Dress("Black", SizeOfDress.M, 1400.0, 2020, 1, 20);
        System.out.println(clothset[0]);
        clothset[1] = new Items("Earrings", 500, 2020, 12, 5);

        for (Items i: clothset) {
            System.out.println("Item: " + i.getDescription());
        }
    }
}
