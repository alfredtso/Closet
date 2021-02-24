package adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAsIterator implements Iterator<Object> {

    Enumeration<?> enumeration;

    public EnumerationAsIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
