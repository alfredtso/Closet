package decorator;

public class WoolTest {
    public static void main(String[] args) {
        Coat basicCoat = new LongCoat();
        System.out.println("Coat, id: " + basicCoat.getID() + ". Description: " + basicCoat.getDescription());

        // id has problem
        basicCoat = new Wool(basicCoat);
        System.out.println("Coat, id: " + basicCoat.getID() + ". Description: " + basicCoat.getDescription() + " "+  basicCoat.getSize());

    }
}
