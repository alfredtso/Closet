package factory;

import simple.Dress;
import simple.Items;
import simple.SizeOfDress;

import java.util.Calendar;

public class SimpleItemFactory {

    public Items createItem(String type) {
        Items item = null;
        Calendar test = Calendar.getInstance();

        if (type.equals("dress")) {
            item = new Dress("White", SizeOfDress.M, 100, 2020, 2,17);
        }

        return item;
    }
}
