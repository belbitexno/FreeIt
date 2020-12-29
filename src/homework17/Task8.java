package homework17;

import java.util.function.Supplier;

public class Task8 {
    public static void main(String[] args) {
        Supplier<Double> randomNumber = () -> Math.random()*2;
        System.out.println(randomNumber.get());

    }
}
