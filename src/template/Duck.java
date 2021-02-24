package template;

public class Duck implements Comparable<Duck> {
    String name;
    int size;

    public Duck(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String toString() {
        return name + " size " + size;
    }

    public int compareTo(Duck other) {

        if (this.size < other.size) {
            return -1;
        } else if (this.size == other.size) {
            return 0;
        } else {
            return 1;
        }
    }
}
