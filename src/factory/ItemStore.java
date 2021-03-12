package factory;

import base.WardrobeItem;

public class ItemStore {
    SimpleItemFactory factory;

    public ItemStore(SimpleItemFactory factory) {
        this.factory = factory;
    }

    public WardrobeItem registerItem(String type) {
        WardrobeItem item;

        item = factory.createItem(type);

        // Call some methods on item
        item.getPrice();

        return item;
    }
}
