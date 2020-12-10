package homework15;

import java.util.ArrayList;

public class NewYearBox<P,V,T> {
    private  P price;
    private  V owner;
    private  ArrayList<T> present;

    public NewYearBox(P price, V owner, ArrayList<T> present) {
        this.price = price;
        this.owner = owner;
        this.present = present;
    }

    public P getPrice() {
        return price;
    }


    public V getOwner() {
        return owner;
    }

    public ArrayList<T> getPresent() {
        return present;
    }

    public void setPrice(P price) {
        this.price = price;
    }

    public void setOwner(V owner) {
        this.owner = owner;
    }

    public void setPresent(ArrayList<T> present) {
        this.present = present;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("У ").append(owner).append(" подарки на сумму ").append(price).append(" рублей").append(": ");
        for(T e : present){
           builder.append(e).append(" ");
        }
        return builder.toString();
    }
}
