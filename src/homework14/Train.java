package homework14;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Train {
    private String destination; // пункт назначения
    private String pointOfDeparture; //пункт отправления
    private GregorianCalendar departureTime;
    private int numberOfTrain;

    public Train(String destination, String pointOfDeparture, GregorianCalendar departureTime, int numberOfTrain) {
        this.destination = destination;
        this.pointOfDeparture = pointOfDeparture;
        this.departureTime = departureTime;
        this.numberOfTrain = numberOfTrain;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPointOfDeparture() {
        return pointOfDeparture;
    }

    public void setPointOfDeparture(String pointOfDeparture) {
        this.pointOfDeparture = pointOfDeparture;
    }

    public GregorianCalendar getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(GregorianCalendar departureTime) {
        this.departureTime = departureTime;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

  /*  @Override
    public int compareTo(Train o) {
        return this.destination.compareTo(o.destination);
    }*/

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd-MMM-yyyy H:mm", Locale.ENGLISH);

        StringBuilder builder = new StringBuilder();
        builder.append("№ поезда ").append(numberOfTrain).append(" ").append(df.format(departureTime.getTime())).append(" ").append(pointOfDeparture).
                append(" ").append(destination);
        return builder.toString();

    }
}
