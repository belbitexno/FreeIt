import java.util.Arrays;
import java.util.TreeSet;


public class MinMax <T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }
    public T min(){
        T min = array[0];
        for(T e: array){
            if(e.compareTo(min)<0){
                min = e;
            }
        }
        return min;
    }

    public T max(){
        T max = array[0];
        for(T e: array){
            if(e.compareTo(max)>0){
                max = e;
            }
        }
        return max;
    }

    public T[] getArray() {
        return array;
    }


}
