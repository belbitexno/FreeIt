package homework11;

import java.util.ArrayList;
import java.util.Objects;

public class House {
    private int number;
    private int countFloor;
    private ArrayList<Room> listOfRoom;

    public House(int number, int countFloor, ArrayList<Room> listOfRoom) {
        this.number = number;
        this.countFloor = countFloor;
        this.listOfRoom = listOfRoom;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCountFloor() {
        return countFloor;
    }

    public void setCountFloor(int countFloor) {
        this.countFloor = countFloor;
    }

    public ArrayList<Room> getListOfRoom() {
        return listOfRoom;
    }

    public void setListOfRoom(ArrayList<Room> listOfRoom) {
        this.listOfRoom = listOfRoom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return number == house.number &&
                countFloor == house.countFloor &&
                Objects.equals(listOfRoom, house.listOfRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, countFloor, listOfRoom);
    }
}
