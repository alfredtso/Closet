package iterator;

import simple.Dress;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DressMenu {
    List<Dress> dresses;

    public DressMenu() {
        this.dresses = new ArrayList<>();
    }

    public java.util.Iterator createIterator() {
        return new DressMenuIterator(dresses);
    }


    private class DressMenuIterator implements java.util.Iterator {

        // only return odd index dress

        private List<Dress> dresses;
        private int pos = 0;

        public DressMenuIterator(List<Dress> dresses) {
            this.dresses = dresses;
        }

        @Override
        public boolean hasNext() {
            // probably bad idea
            return dresses.get(pos+2) != null;
        }

        @Override
        public Dress next() {
            dresses.get(pos+2);
            pos += 2;
            return null;
        }
    }
}
