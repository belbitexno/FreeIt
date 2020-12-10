import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Integer [] array = {5,7,20};
        MinMax<Integer> d = new MinMax<Integer>(array);
        System.out.println(d.max());
        System.out.println(d.min());

    }
}
