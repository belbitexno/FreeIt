package homework11;

import java.util.ArrayList;
import java.util.Objects;

public class Room {
    private ArrayList<Citizen> listOfCitizen;

    public Room(ArrayList<Citizen> listOfCitizen) {
        this.listOfCitizen = listOfCitizen;
    }


    public ArrayList<Citizen> getListOfCitizen() {
        return listOfCitizen;
    }

    public void setListOfCitizen(ArrayList<Citizen> listOfCitizen) {
        this.listOfCitizen = listOfCitizen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(listOfCitizen, room.listOfCitizen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfCitizen);
    }
}
