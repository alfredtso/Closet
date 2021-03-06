package iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
       if (position >= items.length || items[position] == null) {
           return false;
       } else {
           return true;
       }
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }

    public void remove() {
        throw new UnsupportedOperationException("No, you should not");
    }
}
