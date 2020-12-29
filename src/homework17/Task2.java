package homework17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task2 {
    private static List<String> list;
    public static void main(String[] args) {
        Predicate <String> checkNull = (s) -> s==null;
        System.out.println(checkNull.test("V"));

       list = Arrays.asList("A",null,"B",null);
       checkOnNull(list,(s) -> s==null);

    }
    public static void checkOnNull(List<String> list,Predicate<String> pr){
        for(int i = 0; i < list.size(); i++){
            if(pr.test(list.get(i))){
                System.out.println("The element number "+ i + " is " + list.get(i));
            }
        }
    }
}
