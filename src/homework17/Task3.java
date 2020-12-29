package homework17;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<String> pr = s -> s != "";
        System.out.println(pr.test("jhh"));

    }
}
