package homework14;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5,6,7,8,9,10};
        Integer [] changingArray = {2,5,4,1,10,9,7,6,8};

        boolean contains;
        for(int i = 0; i < array.length;i++){
            contains = Arrays.asList(changingArray).contains(array[i]);
            if(!contains){
                System.out.println(array[i]);
            }
        }
    }
}
