public class Task5 {
    /*
    Дана упорядоченная последовательность чисел от 1 до N.
Из нее удалили одно число, а оставшиеся перемешали.
Найти удаленное число за 1 проход по массиву (т.е. ыцикл
for используется только 1 раз).
    * */
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int [] arrayWithoutOneElement = {2,4,3,6,5,9,8,7,10};
        int sumOfArray=0;
        int sumOfArrayWithoutOneElement=0;
        for(int i = 0; i < array.length;i++){
            sumOfArray+=array[i];
            if(i < arrayWithoutOneElement.length){
                sumOfArrayWithoutOneElement+=arrayWithoutOneElement[i];
            }
        }
        System.out.println(sumOfArray-sumOfArrayWithoutOneElement);
    }
}
