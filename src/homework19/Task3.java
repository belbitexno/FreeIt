package homework19;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/*
Порт. Корабли заходят в порт для разгрузки/загрузки контейнеров. Число контейнеров,
находящихся в текущий момент в порту и на корабле, должно быть неотрицательным и
превышающим заданную грузоподъемность судна и вместимость порта. В порту работает
несколько причалов. У одного причала может стоять один корабль. Корабль может
загружаться у причала, разгружаться или выполнять оба действия.*/
public class Task3 {
    private static final BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new Thread(()-> {
        try {
            produce();
        } catch (InterruptedException e) {
            System.out.println("Something went wrong");
        }
    });

    Thread thread2 = new Thread(() -> {
        try {
            consumer();
        } catch (InterruptedException e) {
            System.out.println("Something went wrong");
        }
    });

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();
    }

    public static void produce() throws InterruptedException {
        Random random = new Random();
        while(true){
            blockingQueue.put(random.nextInt(50));
       }
    }
    public static void consumer() throws InterruptedException {
     while (true){

            Thread.sleep(100);
            System.out.println(blockingQueue.take());
            System.out.println("Size - " + blockingQueue.size());
            System.out.println(blockingQueue.toString());

        }
    }
}
