/*
Необходимо реализовать класс-обертку над массивом ArrayWrapper,
который может хранить массив любого типа данных. Индексация
элементов этим классов ведется от 1.
Определить один конструктор, в который передается массив любого типа.
Определить метод получения элемента по индексу (пример: get(2)) (счет
ведется от 1, а не от 0).
Определить метод замены элемента по определенному индексу (пример:
replace(1, “Test”)). Реализовать следующие ограничения:
Для String: заменить строку можно только на строку большей длины
Для Integer: заменить число можно только на большее по значению
Метод replace должен возвращать boolean значение успешности замены.
Реализовать класс-исключение throw new IncorrectArrayWrapperIndex
(unchecked), которое выбрасывается при выходе за границы.
Используйте Generics.
* */

public class ArrayWrapper<T> {
  private T[] array;

    public ArrayWrapper(T[] array) {
        this.array = array;
    }

    private void indexCheck(int index) {
        if(index<1){
            throw new IncorrectArrayWrapperIndex("Incorrect index");
        }
    }

    public T get(int index) {
       indexCheck(index);
       return array[index-1];
    }

    public  <T extends Number & Comparable<T>> boolean replace(T[] array,int index, Integer x){
        indexCheck(index);
        if (array[index - 1].compareTo((T)x)<0) {
            array[index - 1] = (T)x;
        return true;
        }else {
            return false;
        }
    }

    public <T extends CharSequence> boolean replace(T[] array,int index, String x){
        indexCheck(index);
        if(array[index-1].length()<x.length()){
            array[index-1] = (T)x;
            return true;
        }else{
            return false;
        }
    }
}
