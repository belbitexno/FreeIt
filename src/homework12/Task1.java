package homework12;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        for(int i = 0;i < 5;i++){
        list.add(new HeavyBox(20));
        }
        System.out.println("List");
        for(HeavyBox e: list){
            System.out.println(e);
        }
        list.get(0).setWeight(21);
        list.remove(4);

        Object[] array1 = list.toArray(); // 1 method
        System.out.println("Method #1 List to Array");
        for(Object e: array1){
            System.out.println(e);
        }

        HeavyBox[] array2 = new HeavyBox[list.size()]; // 2 method
        for(int i = 0; i < array2.length;i++){
            array2[i] = list.get(i);
        }

        System.out.println("Method #2 List to Array");
        for(HeavyBox e: array2){
            System.out.println(e);
        }

        HeavyBox[] array3 = list.toArray(new HeavyBox[0]);
        System.out.println("Method #3 List to Array");
        for(HeavyBox e: array3){
            System.out.println(e);
        }

        list.clear();
        System.out.println("Удалили из списка");
        System.out.println(list);

    }
    /*public static class HeavyBox{
        private int weight;

        public HeavyBox(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "HeavyBox{" +
                    "weight=" + weight +
                    '}';
        }
    }*/
}
