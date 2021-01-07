package homework18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
* В текстовом файле лежат данные о покупателях и их покупках (в любом удобном формате).
Создать классы Клиент (покупатель) и Покупка. Создать класс ClientRepository, в котором
разместить методы для работы с файлом: добавить нового покупателя со списком покупок, по
id покупателя найти список его покупок, по email найти покупателя (учитывать то, что
покупателя с нужным id или email может не быть, использовать Optional для возвращаемых
значений методов). Написать класс main с использованием методов класса ClientRepository.
* */
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        List<Client.Product> listProduct1 = new ArrayList<>();
        Collections.addAll(listProduct1,new Client.Product("ball"),new Client.Product("rocket"));
        List<Client.Product> listProduct2 = new ArrayList<>();
        Collections.addAll(listProduct2,new Client.Product("ball"),new Client.Product("rocket"),
                new Client.Product("phone"),new Client.Product("pen"));
        ClientRepository.addClient(new Client("acubensby@gmail.com","Ivan",listProduct1));
        ClientRepository.addClient(new Client("lll@mail.ru","Olga",listProduct2));
        try {
            ClientRepository.findProductsById(Integer.parseInt(rd.readLine()));
        }catch (NumberFormatException e){
            System.out.println("Enter number");
            ClientRepository.findProductsById(Integer.parseInt(rd.readLine()));
        }
        ClientRepository.emailClient(rd.readLine());
    }
}
