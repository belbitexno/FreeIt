package homework12;

import homework11.Test;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(200));
        list.add(new HeavyBox(310));
        list.add(new HeavyBox(100));
        list.add(new HeavyBox(400));
        list.add(new HeavyBox(300));
        System.out.println(list);
        checkWeight(list);
    }

    public static void checkWeight(ArrayList<HeavyBox> list){
        ArrayList<HeavyBox>newList = new ArrayList<>();
        for(HeavyBox e: list){
            if(e.getWeight()>300){
                newList.add(e);
            }
        }
        System.out.println(newList);
    }
}
