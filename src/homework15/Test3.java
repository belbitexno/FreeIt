package homework15;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> present = new ArrayList<>();
        present.add("мяч");
        present.add("тетрис");
        NewYearBox<Integer,String,String> box = new NewYearBox<Integer,String,String>(200,"Васи",present);
        System.out.println(box);

        present.add("кукла");
        NewYearBox<String,String,String> box2 = new NewYearBox<>("300","Нелли",present);
        System.out.println(box2);
    }
}
