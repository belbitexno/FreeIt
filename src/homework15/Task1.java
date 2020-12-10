package homework15;

public class Task1 {
    public static void main(String[] args) {

        Cat cat = new Cat("red","pers");
        System.out.println(cat);

        System.out.println("++++++++++++++++++++++");

        System.out.println(cat.changeColor("green"));
        System.out.println(cat.changeBreed("british cat"));

    }
}
