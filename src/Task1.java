package homework16;

public class Main {
    public static void main(String[] args)  {
        Integer [] arrayInteger = {1,2,3,4,5,6};
        ArrayWrapper<Integer> array1 = new ArrayWrapper<Integer>(arrayInteger);
        System.out.println(array1.get(1));
        System.out.println("Заменили элемент массива на большее число: " + array1.replace(arrayInteger,1,10));
        System.out.println(array1.get(1));

        System.out.println("___________________________________");

        String [] arrayString = {"Дом", "Собака", "Кот"};
        ArrayWrapper<String> array2 = new ArrayWrapper<>(arrayString);
        System.out.println(array2.get(1));
        System.out.println("Заменили элемент массива на слово длинее предудущего: " +array2.replace(arrayString,1,"Котедж"));
        System.out.println(array2.get(1));
        System.out.println(array2.get(0)); // индексация массива с 1
    }
}
