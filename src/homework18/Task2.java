package homework18;

public class Task2 {


    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Run());
        Thread thread2 = new Thread(new Run());
        Thread thread3 = new Thread(new Run());
        thread1.start();
        Thread.sleep(5000);
        thread2.start();
        Thread.sleep(5000);
        thread3.start();
    }
}
