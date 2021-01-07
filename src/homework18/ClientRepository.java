package homework18;

import java.io.*;
import java.util.ArrayList;

public class ClientRepository {

//не очень понял, где использовать Optional, видимо не понял задание
    public static void addClient(Client client){
        File myFile = new File("C:\\Users\\Ivan\\Desktop\\fff.TXT");

        try {

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(myFile, true));
            String lineSeparator = System.getProperty("line.separator");
            StringBuilder rd = new StringBuilder();
            for(Client.Product e:client.getListOfProduct()){
                rd.append(e.getName()).append(" ");
            }
            fileWriter.write("id:" + Client.getId() + ", email: " + client.getEmail() + ", name: " + client.getName()
                    + ", покупки: " +rd.toString()
                    +lineSeparator);

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void findProductsById(long id) throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader("C:\\Users\\Ivan\\Desktop\\fff.TXT"));
        String line;
        if(id<=0){
            System.out.println("Wrong id");
        }
        String findId = "id:" + id;
        while ((line = rd.readLine()) != null) {
            if (line.contains(findId)) {
                System.out.println(line.substring(line.lastIndexOf(":") + 2));
            }
        }
        rd.close();
    }
    public static void emailClient(String email) throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader("C:\\Users\\Ivan\\Desktop\\fff.TXT"));
        ArrayList<String> listOfLine = new ArrayList<>();
        String line;
        if(!email.matches("^([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})$")){
            System.out.println("check email");
        }
        while ((line = rd.readLine()) != null) {
            if (line.contains(email)) {
                System.out.println(line.substring(line.indexOf("name:")+6,line.indexOf("покупки:")-2));
                break;
            }else{
            listOfLine.add(rd.readLine());
            }
        }
        for(String e :listOfLine){
            if(!e.contains(email)){ // тут может кидать NullPointException, если в файле первая строчка оказалась пустая
                //тут как-то можно обработать ошибку?
                System.out.println("No client with this email");
            }
        }

        rd.close();
    }
}
