package homework20;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;

    public Product(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return name;
    }
}

