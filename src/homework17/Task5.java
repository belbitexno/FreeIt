package homework17;

import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {
        String line = "NaNA";
        Predicate<String> checkJ = s -> s.substring(0,1).equals("J");
        Predicate<String> checkN = s -> s.substring(0,1).equals("N");
        Predicate<String> checkLastA = s -> s.substring(s.length()-1).equals("A");

        System.out.println(checkJ.or(checkN).and(checkLastA).test(line));
    }
}
