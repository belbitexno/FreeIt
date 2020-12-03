package homework14;

public class Car implements Comparable<Car>{
    private String name;
    private int cost;
    private int fuelConsumption;
    private int speed;

    public Car(String name, int cost, int fuelConsumption, int speed) {
        this.name = name;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int compareTo(Car o) {
       if(fuelConsumption>o.fuelConsumption){
           return 1;
       }else if(fuelConsumption<o.fuelConsumption){
           return -1;
       }else{
           return 0;
       }
    }

    @Override
    public String toString() {
        return "name: " + name + " cost: " + cost + " fuelConsumption: " + fuelConsumption + " speed: " + speed;
    }
}
