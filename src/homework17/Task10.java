package homework17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task10 {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        Stream <String> stream = array.stream();
        System.out.println(stream.findFirst().orElse("0")); //task a



        System.out.println("-----------------------task b");
        array = Arrays.asList("Дима","Оля","Валерия", "line1","арбуз","line8", "1");

        System.out.println( array.stream().filter("line1"::equals).count()); //task b

        System.out.println("----------------------- task c");
        System.out.println(array.stream().reduce((s1,s2) -> s2).orElse("empty")); //task c

        System.out.println("----------------------- task d");
        array.stream().skip(1).limit(2).forEach(System.out::println); // task d

        System.out.println("----------------------- task e");
        array.stream().filter(e -> e.substring(0,1).equals("а")).forEach(System.out::println); //task e

        System.out.println("-----------------------task f");
        System.out.println(array.stream().anyMatch("line8"::equals));//task f


        System.out.println("-----------------------task g");
        System.out.println(array.stream().allMatch(e -> e.contains("1"))); // task g
        System.out.println("----------------------- task h");
        Stream.of("Оля", "Валерия", "Женя", "Валерия").sorted().distinct().forEach(System.out::println); //task h

    }
}
