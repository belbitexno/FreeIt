package homework14;
import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Car> taxiPark = new ArrayList<>();
        taxiPark.add(new EconomyCar("ford",12000,8,90));
        taxiPark.add(new EconomyCar("opel",12500,6,95));
        taxiPark.add(new BusinessCar("BMW",120000,111,120));
        taxiPark.add(new BusinessCar("Porsh",110000,120,180));
        Collections.sort(taxiPark);
        System.out.println(taxiPark);
        System.out.println("----------------------------------");
        speed(1,95,taxiPark);
        System.out.println("-----------------------------------");
        sumOfCost(taxiPark);
    }
    public static void speed(int beginSpeed, int finishSpeed, ArrayList<Car> taxiPark){
        for(Car e: taxiPark){
            if(e.getSpeed()>=beginSpeed && e.getSpeed()<=finishSpeed){
                System.out.println(e);
            }
        }
    }
    public static void sumOfCost(ArrayList<Car> taxiPark) {
        int cost = 0;
        for (Car e : taxiPark) {
            cost += e.getCost();
        }
        System.out.println("Стоимость автопарка: " + cost);
    }
}
