package homework18;

public class NewThread extends Thread{
    @Override
    public void run() {
      for(int i = 1;i<=100;i++){
          System.out.println(this.getName() + ": " + i);
      }
    }
}
