package homework14;

import java.util.Comparator;

public class Parrot implements Comparable<Parrot>{
    private String name;

    public Parrot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot " + name;
    }

    @Override
    public int compareTo(Parrot o) {
        return name.compareTo(o.name);
    }
}
