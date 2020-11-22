import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // не слушал пояснения к задаче, хотя вроде переменную не используем,
        // но вряд ли это решение понравилось в Google-)
        int a = 3;
        int b = 4;
        list.add(a);
        list.add(b);
        a = list.get(1);
        b = list.get(0);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
