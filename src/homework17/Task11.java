package homework17;

import java.util.*;

public class Task11 {
    public static void main(String[] args) {
        ArrayList<People> people = new ArrayList<>();
        Collections.addAll(people,new People("Ваня",20,"м"),new People("Валерия",25,
                "ж"), new People("Оля", 27,"ж"), new People("Веолета", 46,"ж"),
                new People("Женя",26,"м"), new People("Дима",50,"м"));

        people.stream().filter(s->s.getAge()>=18 && s.getAge()<=27 && s.getSex().equals("м")).forEach(System.out::println); // task a
        System.out.println("______________________________________________");
        System.out.println(people.stream().filter(s->s.getSex().equals("ж")).mapToInt(People::getAge).average().getAsDouble()); //task b
        System.out.println("______________________________________________");
        System.out.println(people.stream().filter((s->(s.getSex().equals("ж") && s.getAge()>=18 && s.getAge()<55)||(s.getSex().equals("м") &&
                s.getAge()>=18 && s.getAge()<60))).count()); // task c
        System.out.println("______________________________________________");
        people.stream().sorted((e1,e2) -> -e1.getName().compareTo(e2.getName())).forEach(e -> System.out.println(e.getName())); // task e
        System.out.println("______________________________________________");

        System.out.println(people.stream().min(Comparator.comparing(People::getAge)).get()); // task d

        }

    }

