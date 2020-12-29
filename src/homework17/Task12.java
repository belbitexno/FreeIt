package homework17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task12 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a1","b2","c3","d1");
        List<String> list2 = Arrays.asList("1,2,0","4,5","1023,231","34,0");
        System.out.println("task a:");
        int[] array = list1.stream().mapToInt(s -> Integer.parseInt(s.substring(1))).toArray();
        for (Integer e:array) {
            System.out.print(e + " ");
        }
        System.out.println("\ntask b:");
       String [] array2 = list2.stream().flatMap(e -> Arrays.stream(e.split(","))).toArray(String[]::new);
        for (String e:array2) {
            System.out.print(e);
        }
        System.out.println("\ntask c:");
        System.out.println(list2.stream().flatMapToInt(s -> Arrays.stream(s.split(",")).mapToInt(Integer::parseInt)).sum());
        System.out.println("task d:");
        int maxList2 = list2.stream().flatMapToInt(s -> Arrays.stream(s.split(",")).mapToInt(Integer::parseInt)).max().getAsInt();
        int maxList1 = list1.stream().mapToInt(s -> Integer.parseInt(s.substring(1))).max().getAsInt();
        System.out.println(Math.max(maxList1, maxList2));
        System.out.println("task e:");
        System.out.println(list1.stream().collect(Collectors.toMap(s ->s.substring(0,1),s->s.substring(1,2))));
    }
}
