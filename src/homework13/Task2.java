import java.sql.SQLOutput;
import java.util.*;
import java.util.Map.Entry;

public class Task2 {
    public static void main(String[] args) {
        Map<Doctor, Pet> map = new HashMap<>();
        map.put(new Doctor("Vasya", 80292966888l), new Cat("Vasky"));
        map.put(new Doctor("Ivan Ivan", 80336594444l), new Cat("Fedku"));
        map.put(new Doctor("Stepa", 80446597777l), new Parrot("Keshu"));
        map.put(new Doctor("Anna", 80446591111l), new Dog("Reks"));

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + "" + entry.getValue());
        }
        System.out.println("________________________________");
        Map<Person, List<Pet>> map2 = new HashMap<>();
        List<Pet> person1  = new ArrayList<>();
        List<Pet> person2  = new ArrayList<>();
        person1.add(new Dog("Varn"));
        person1.add(new Cat("Feny"));
        person2.add(new Parrot("Keshu"));
        person2.add(new Cat("Feny"));
        person2.add(new Dog("Lexu"));
        map2.put(new Person("Ivan"),person1);
        map2.put(new Person("Nelly"),person2);

        for (Map.Entry entry : map2.entrySet()) {
            System.out.println(entry.getKey() + "" + entry.getValue());
        }



    }

}
