package homework17;

import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.Function;

public class Task6 {
    public static void main(String[] args) {
        Consumer <HeavyBox> consumer1 = box -> System.out.printf("Отгрузили ящик с весом %d кг \n",box.getWeight());
        Consumer<HeavyBox> consumer2 = box -> System.out.printf("Отправляем ящик с весом %d кг",box.getWeight());
        consumer1.andThen(consumer2).accept(new HeavyBox(6));
    }
}
