package homework19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/*
 Необходимо создать три потока, которые изменяют один и тот же объект. Каждый поток
должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1. 
a) Создать класс расширяющий Thread. 
б) Переопределить метод run() - здесь будет находиться синхронизированный блок кода. 
в) Для того чтобы три объекта потока имели доступ к одному объекту, создаем конструктор
принимающий на вход StringBuilder объект. 
г) Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта
в). 
д) Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз, а потом
увеличьте значение символа на 1. 
е) В методе main() создайте один объект класса StringBuilder, используя символ ‘a’. Затем
создайте три экземпляра объекта нашего класса и запустите потоки.*/
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder builder = new StringBuilder();
        builder.append("a");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 3; i++){
            executorService.submit(new ChangeOneObject(builder));
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);
    }
}
class ChangeOneObject extends Thread{ // наверное этот вариант оптимальный, чем использовать лок
    private final StringBuilder builder;
    public ChangeOneObject(StringBuilder builder){
        this.builder = builder;
    }
    @Override
    public void run() {
       synchronized (builder){
           for(int i = 0; i < 10; i++){
               System.out.println(builder.toString());
               builder.append(" 1");
           }
       }
    }
}
