package homework14;

import java.util.Comparator;

public class LengthOfNameParrot implements Comparator<Parrot> {


     @Override
    public int compare(Parrot o1, Parrot o2) {
        if(o1.getName().length()>o2.getName().length()){
            return 1;
        }else if (o1.getName().length()<o2.getName().length()){
            return -1;
        }else{
            return 0;
        }
    }
}
