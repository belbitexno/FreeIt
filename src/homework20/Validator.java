package homework20;

public class Validator {


    public static void checkEmail(String email) {
        if(!email.matches("^([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})$")) {
            throw  new WrongEmail();
        }
    }
}
