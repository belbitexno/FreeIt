package homework17;


public class Task1 {
    public static void main(String[] args) {
        Printable printable = (name) -> System.out.println(name + " Pogosky");
        printable.print("Ivan");
        printable.print("Vlad");
    }
}
