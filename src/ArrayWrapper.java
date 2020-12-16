package homework16;

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
