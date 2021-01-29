package homework20;

import java.io.*;
import java.util.*;
import org.slf4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;
/*
* В текстовом файле лежат данные о покупателях и их покупках (в любом удобном формате).
Создать классы Клиент (покупатель) и Покупка. Создать класс ClientRepository, в котором
разместить методы для работы с файлом: добавить нового покупателя со списком покупок, по
id покупателя найти список его покупок, по email найти покупателя (учитывать то, что
покупателя с нужным id или email может не быть, использовать Optional для возвращаемых
значений методов). Написать класс main с использованием методов класса ClientRepository.
* */
public class Task1 {
    public static void main(String[] args) throws IOException {
        PropertyConfigurator.configure("Log4j.properties");
        Logger log = LoggerFactory.getLogger(Task1.class.getName());

        log.info("Program is being begun");

        ClientRepository clientRepository = new ClientRepository();
        File file2 = new File(ClientRepository.fileId);

        BufferedReader reader = null;
        if(file2.exists()){
            reader = new BufferedReader(new FileReader(ClientRepository.fileId));
            ClientRepository.id = Integer.parseInt(reader.readLine()); // Валерия, не могу понять почему у меня пишет
        }                                                              // в консоле null, если fileId еще не создан,
        else {                                                         //но работает все, Exception не выкидывает?
           ClientRepository.id = 0;
        }
        if ( reader != null)
            reader.close();

        clientRepository.readClient();

        List<Product> listProduct1 = new ArrayList<>();
        Collections.addAll(listProduct1, new Product("ball"), new Product("rocket"));
        List<Product> listProduct2 = new ArrayList<>();
        Collections.addAll(listProduct2, new Product("ball"), new Product("rocket"),
                new Product("phone"), new Product("pen"));


        clientRepository.addClient(new Client("acubensby@gmail.com", "Ivan", listProduct1));
        clientRepository.addClient(new Client("fff@mail.com", "Alex", listProduct2));

        try {
            Client productsById = clientRepository.findProductsById(3);
            for (Product e : productsById.getListOfProduct()) {
                log.info("Found client's product by id {}: {}",productsById.getIdClient(),e);
            }
        }
        catch(WrongId h) {
            log.error("There is no client with this id or id must be more zero");
        }

        try {
            Optional<Client> nameByEmail = clientRepository.emailClient("fff@mail.com");
            if (nameByEmail.isPresent()) {
                log.info("Found client's name by email {}: ",nameByEmail.get().getName());
            } else {
                log.info("there is no client with this email");
            }
        }catch (WrongEmail e){
            log.error("Wrong email");
        }

        clientRepository.saveClient();

        log.info("Program has finished");
        }
    }
