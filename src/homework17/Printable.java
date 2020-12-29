package homework17;

@FunctionalInterface
public interface Printable {

    abstract void print(String t);

    static void UpperCase(String t){
        System.out.println(t.toUpperCase());
    }
}
