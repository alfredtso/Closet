package factory;

import simple.Dress;
import simple.Items;
import simple.SizeOfDress;

public class SimpleItemFactory {

    public Items createItem(String type) {
        Items item = null;

        if (type.equals("dress")) {
            item = new Dress("White", SizeOfDress.M, 100, 2020, 2,17);
        }

        return item;
    }
}
