package template;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class MyStringList extends AbstractList<String> {
    private String[] myList;
    private List<String> mySecondList;

    MyStringList(String[] myList) {
        this.myList = myList;
        this.mySecondList = Arrays.asList(myList);
    }

    @Override
    public String get(int index) {
        // just try to do random stuff as PoC
        return myList[index] + mySecondList.get(index);
    }

    @Override
    public int size() {
        return myList.length;
    }

    public String set(int index, String item) {
        String old = myList[index];
        myList[index] = item;
        // again random stuff
        mySecondList.set(index, item);
        return old;
    }

    public static void main(String[] args) {
        String[] dius = {"diu", "nei", "ah"};
        MyStringList diuList = new MyStringList(dius);
        List sublist = diuList.subList(1,2);
        System.out.println(sublist);
    }
}
