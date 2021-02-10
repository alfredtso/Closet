package factory;

import simple.Items;

public class ItemStore {
    SimpleItemFactory factory;

    public ItemStore(SimpleItemFactory factory) {
        this.factory = factory;
    }

    public Items registerItem(String type) {
        Items item;

        item = factory.createItem(type);

        return item;
    }
}
