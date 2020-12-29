package homework17;

import java.util.function.Function;

public class Task7 {
    public static void main(String[] args) {
        Function<Integer, String>function = number ->{
            if(number>0){
                return "Положительное число";
            }
            else if(number < 0){
                return "Отрицательное число";
            }
            else{
                return "Ноль";
            }
        };
        System.out.println(function.apply(0));
    }
}
