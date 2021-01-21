package homework19;
/*Имеются один или несколько производителей, генерирующих данные некоторого типа
(например, числа) и помещающих их в коллекцию, а также единственный потребитель,
который извлекает помещенные в коллекцию элементы по одному. Необходимо
организовать безоопасный доступ к коллекции.
*/
import java.util.concurrent.atomic.AtomicInteger;

public class Port {

    public static void main(String[] args) {
    Dock dock = new Dock(10,100);
    Sheep sheep1 = new Sheep("Фартуна",5,dock,10);
    Sheep sheep2 = new Sheep("Удача", 3,dock,5);
    Sheep sheep3 = new Sheep("Надежда", 10,dock,50);
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            sheep1.loadingThread();
        }
    });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sheep2.unLoadingThread();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                    sheep3.loadingAndUnLoadingThread();
            }
        });
    thread1.start();
    thread2.start();
    thread3.start();
    }

}

 class Dock{
     private final AtomicInteger containers = new AtomicInteger();
     private final int maxContainers;

     public Dock (int containers,int maxContainers) {
         this.containers.set(containers);
         this.maxContainers = maxContainers;
     }

     public boolean loadingContainers(){
         if(containers.get()< maxContainers){
             containers.incrementAndGet();
             return true;
         }else{
             return false;
         }
     }

     public boolean unloadingContainers(){
         if(containers.get()>0){
             containers.decrementAndGet();
             return true;
         }else {
             return false;
         }
     }

     public int containersGet(){
         return containers.get();
     }
 }

class Sheep{
    private String name;
    private  int sheepContainers;
    private Dock dock;
    private int maxContainersSheep;

    public Sheep(String name, int sheepContainers, Dock dock, int maxContainersSheep) {
        this.name = name;
        this.sheepContainers = sheepContainers;
        this.dock = dock;
        this.maxContainersSheep = maxContainersSheep;
    }


    public void loadingThread(){
        boolean check = false;
        for(int i = 0;i<5;i++) {
            if (sheepContainers > 0 & dock.loadingContainers()) {
                sheepContainers--;
                System.out.println(name + ", на коробле : " + sheepContainers + " контейнера, на пречале: "
                        + dock.containersGet() + " контейнеров");
                check = true;
            } else {
                System.out.println("В порту нет места");
                break;
            }
        }
        if(check)
        System.out.println(name + " закончила разгрузку");
    }
    public void unLoadingThread(){
        boolean check = false;
        for(int i = 0;i<5;i++){
            if (sheepContainers < maxContainersSheep && dock.unloadingContainers()){
                sheepContainers++;
                System.out.println(name + ", на коробле : " + sheepContainers + " контейнера, на пречале: "
                        + dock.containersGet() + " контейнеров");
                check = true;
            }else{
                System.out.println(name + ": на корабле мест нет");
                break;
            }
        }
        if(check)
        System.out.println(name + " закончила загрузку");
    }

    public void loadingAndUnLoadingThread()  {

            if (sheepContainers > 0 & dock.loadingContainers()&&sheepContainers < maxContainersSheep && dock.unloadingContainers()) {
                sheepContainers--;
                sheepContainers++;
                System.out.println(name + " загрузила и разгрузила контейнеры");

        }else {
                System.out.println(name + " загрузка порта или корабля невозможна");
            }
    }
}


