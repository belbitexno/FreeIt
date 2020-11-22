import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,4,9,7,5,4,6,1,1,3,9,11,45,4,11,19,45,4,11,44,6,3};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            map.put(i,array[i]);
        }

        for (int value : array) {
            int x = Collections.frequency(map.values(), value);
            System.out.println(value + " -> " + x);
        }
    }
}
