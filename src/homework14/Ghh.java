package homework14;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ghh {
    public static Date date;
    public static void main(String[] args) throws ParseException {
       String time = "20:00";
       //String time2 = "19:00";
       date = new SimpleDateFormat("H:mm").parse(time);

      // time("19:00");
        DateFormat f = new SimpleDateFormat("H:mm");
        Calendar s = new GregorianCalendar(2020,Calendar.DECEMBER,9,20,00);
       /* s.set(2020, Calendar.DECEMBER,9,20,00);
        System.out.println(f.format(s.getTime()));*/
    }
    public static void time(String time) throws ParseException {
        if(new SimpleDateFormat("H:mm").parse(time).getHours()<date.getHours()) {
            System.out.println(date.getHours());
        }
    }
}
