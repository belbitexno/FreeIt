package homework14;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Train> listOfTrain = new ArrayList<>();
        listOfTrain.add(new Train("Minsk","Гомель",new GregorianCalendar(),321));
        listOfTrain.add(new Train("Minsk","Витебск",new GregorianCalendar(),504));
        listOfTrain.add(new Train("Gomel","Витебск",new GregorianCalendar(),405));
        listOfTrain.get(0).getDepartureTime().set(2020, Calendar.DECEMBER,15,20, 0,0);
        listOfTrain.get(1).getDepartureTime().set(2020, Calendar.DECEMBER,15,21, 30,0);
        listOfTrain.get(2).getDepartureTime().set(2021, Calendar.JANUARY,15,20, 0,0);

        destination("Gomel",listOfTrain);
        System.out.println("-------------------------");
        departureTimeAndDestination("Minsk",new GregorianCalendar(2020, Calendar.DECEMBER,15,
                19, 0,0),listOfTrain);
        System.out.println("--------------------------");
        pointOfDepartureToDestination("Гомель", "Minsk", listOfTrain);
    }
    public static void destination(String destination, ArrayList<Train> listOfTrain){
        int x = 0;
        for(Train e: listOfTrain){
           x = destination.compareTo(e.getDestination());
           if(x==0){
               System.out.println(e);
           }
        }
    }
    public static void departureTimeAndDestination(String destination,GregorianCalendar departureTime,ArrayList<Train>listOfTrain){
    int x = 0;
    for(Train e: listOfTrain){
        x = destination.compareTo(e.getDestination());
        if(x==0 && departureTime.get(Calendar.HOUR)<e.getDepartureTime().get(Calendar.HOUR)){
            System.out.println(e);
        }
    }
}
// не очень понял как написать Comparator, чтобы не использовать equals
    public static void pointOfDepartureToDestination(String pointOfDeparture,String destination, ArrayList<Train>listOfTrain){
        int x = 0;
        for(Train e: listOfTrain){
            x = destination.compareTo(e.getDestination());
            if(x==0 && pointOfDeparture.equals(e.getPointOfDeparture())){
                System.out.println(e);
            }
        }
    }
}


