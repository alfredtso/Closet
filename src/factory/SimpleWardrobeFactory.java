package factory;

import base.Dress;
import base.WardrobeItem;

public class SimpleWardrobeFactory {

    // Receipt Scanner can use this to create WardrobeItem
    // Maybe WardrobeType shouldn't be inner class
    // either size should not be ENUM or will be problematic (variety)
    // TODO: Better solution for multi arg

    // This can be static method (common practice)
    public WardrobeItem createWardrobeItem(WardrobeItem.WardrobeItemType type,
                                           String des, double price,
                                           int year, int month,
                                           int day, String size) {
        WardrobeItem item = null;

        if (type.equals(WardrobeItem.WardrobeItemType.DRESS)) {
            item = new Dress(des, size, price, year, month, day);
        }

        return item;
    }
}
