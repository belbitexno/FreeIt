package homework20.task2;

public class ArrayWrapper <T extends Comparable<T>>{
    private T[] array;

    public ArrayWrapper(T[] array) {
        this.array = array;
    }

    private void indexCheck(int index) {
        if(index<1 || index > array.length){
            throw new IncorrectArrayWrapperIndex("Incorrect index");
        }
    }

    public T get(int index) {
        indexCheck(index);
        return array[index-1];
    }

    public boolean replace(int index, T e){
        indexCheck(index);
        index = index - 1;
        if(array instanceof String[]){
            String[] arrayString = (String[]) array;
            String s = (String) e;
            if (arrayString[index].length()<s.length()){
                arrayString[index]=s;
                return true;
            }
        }else if (array instanceof Number[]){
            if(array[index].compareTo(e)<0){
                array[index] = e;
                return true;
            }
        }else {
            if (array[index].compareTo(e)<0){
                array[index]=e;
                return true;
            }
        }
        return false;
    }


}
