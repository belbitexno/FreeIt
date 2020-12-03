package homework14;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        TreeMap<Parrot,Doctor> treeMap = new TreeMap<>();
        treeMap.put(new Parrot("Вася"), new Doctor("Petr",1));
        treeMap.put(new Parrot("Алекс"), new Doctor("Petrovich",2));
        treeMap.put(new Parrot("Димка"), new Doctor("Gosha",3));
        for(Map.Entry e: treeMap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println("----------------------");
        TreeMap<Parrot,Doctor> treeMap2 = new TreeMap<>(new LengthOfNameParrot());
        treeMap2.put(new Parrot("Андрей"), new Doctor("Petr",1));
        treeMap2.put(new Parrot("Вася"), new Doctor("Petrovich",2));
        treeMap2.put(new Parrot("Дмитрий Михалыч"), new Doctor("Gosha",3));

        for(Map.Entry e: treeMap2.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
