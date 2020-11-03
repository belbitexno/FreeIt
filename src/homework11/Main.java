package homework11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> district = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            district.add(new House(i+1,i+3,new ArrayList<>()));
        }

        district.get(0).getListOfRoom().add(new Room(new ArrayList<>()));
        district.get(0).getListOfRoom().get(0).getListOfCitizen().add(new Citizen("Ivan","Petrov",18));

        district.get(1).getListOfRoom().add(new Room(new ArrayList<>()));
        district.get(1).getListOfRoom().get(0).getListOfCitizen().add(new Citizen("Ivan","Sidorov",20));

        district.get(2).getListOfRoom().add(new Room(new ArrayList<>()));
        district.get(2).getListOfRoom().add(new Room(new ArrayList<>()));
        district.get(2).getListOfRoom().get(0).getListOfCitizen().add(new Citizen("Vasya","He",15));
        district.get(2).getListOfRoom().get(1).getListOfCitizen().add(new Citizen("V","He",25));
        district.get(2).getListOfRoom().get(1).getListOfCitizen().add(new Citizen("Va","He",15));

        district.get(3).getListOfRoom().add(new Room(new ArrayList<>()));
        district.get(3).getListOfRoom().get(0).getListOfCitizen().add(new Citizen("Nexta","Nexta",20));

        district.get(4).getListOfRoom().add(new Room(new ArrayList<>()));
        district.get(4).getListOfRoom().get(0).getListOfCitizen().add(new Citizen("Nexta","Nexta",18));

        //Дом, который надо найти, что-то не придумал как это в один метод все засунуть
        House findingHouse = new House(3,5,new ArrayList<>());
        Room room1 = new Room(new ArrayList<>());
        room1.getListOfCitizen().add(new Citizen("Vasya","He",15));
        findingHouse.getListOfRoom().add(room1);
        Room room2 = new Room (new ArrayList<>());
        room2.getListOfCitizen().add(new Citizen("V","He",25));
        room2.getListOfCitizen().add(new Citizen("Va","He",15));
        findingHouse.getListOfRoom().add(room2);
        if(district.contains(findingHouse)) {
            System.out.println("В районе есть данный дом");
        }
            else{
                System.out.println("Данный дом отсуствует");
            }
        }
    }

