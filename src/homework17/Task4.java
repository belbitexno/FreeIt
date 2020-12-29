package homework17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) throws IOException {

        String d = "jhh";
        Predicate<String> checkNull = s -> s!=null;
        Predicate<String> empty = z -> z!="";

        System.out.println(checkNull.and(empty).test(d));

        List<String> array = Arrays.asList("","New",null,"Year");
        for(String s: array){
            if(checkNull.and(empty).test(s)){
                System.out.print(s + " ");
            }
        }
    }
}
