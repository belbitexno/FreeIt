package homework20;

import java.io.*;
import java.util.ArrayList;
import java.util.Optional;

public class ClientRepository {
    public static final String file = "C:\\Users\\Ivan\\Desktop\\vanya.TXT";
    public static final String fileId = "C:\\Users\\Ivan\\Desktop\\indificator.TXT"; //файл - генератор
    public static int id;
    ArrayList<Client> listOfClients = new ArrayList<>();



    public  void addClient(Client client){
        listOfClients.add(client);

    }

    public void saveClient() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)))
        {
            oos.writeObject(listOfClients);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileId));
        String s = String.valueOf(id);
        writer.write(s);
        writer.close();
    }

    public void readClient() throws FileNotFoundException {

        FileInputStream fileInputStream= new FileInputStream(file);
        if (fileInputStream!=null) {
            try (ObjectInputStream oos = new ObjectInputStream(fileInputStream)) {

                listOfClients = ((ArrayList<Client>) oos.readObject());

            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public Client findProductsById(long id){
        Client client = null;
        for(Client e: listOfClients){
            if(e.getIdClient()==id){
               client=e;
            }
        }
        if(client==null)
            throw new WrongId();
        return client;
    }

        public Optional<Client> emailClient(String email){
            Validator.checkEmail(email);
            return listOfClients.stream().filter(s -> s.getEmail().equals(email)).findFirst();
        }

    }

