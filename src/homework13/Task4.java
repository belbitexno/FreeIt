import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println(removeDuplicate(list));
    }
    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
    }

