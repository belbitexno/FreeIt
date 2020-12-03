package homework14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(max(5,2));

    }
    public static int max(int a, int b){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(a);
        list.add(b);
        Collections.sort(list);
        return list.get(1);
    }
}
