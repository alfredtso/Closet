package adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class IteratorAsEnumeration implements Enumeration<Object> {

    Iterator<?> iterator;

    public IteratorAsEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ls.add(i);
        }
        Iterator<Integer> it = ls.iterator();

        IteratorAsEnumeration test = new IteratorAsEnumeration(it);

        // Mimic client calling Enumeration interface
        for (int i = 0; i < 5; i++) {
            System.out.println(test.hasMoreElements());
            System.out.println(test.nextElement());
        }

    }
}
