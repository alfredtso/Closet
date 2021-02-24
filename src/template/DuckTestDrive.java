package template;

import java.util.Arrays;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Diu",3),
                new Duck("Siu",6),
                new Duck("Tiu",5),
                new Duck("Liu",2)
        };
        System.out.println("Before sorting: ");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("After sorting: ");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (Duck d: ducks) {
            System.out.println(d);
        }
    }
}
