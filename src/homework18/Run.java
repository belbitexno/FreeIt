package homework18;

public class Run implements Runnable{
    @Override
    public void run() {

            for(int i=1;i <=100;i++){
                if(i%10==0) {
                    try {
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread() + ": " + i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
    }
}
