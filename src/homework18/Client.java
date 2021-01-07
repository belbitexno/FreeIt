package homework18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static long id=0;
    private String email;
    private String name;
    private List<Product> listOfProduct;

    public Client(String email, String name,List<Product> listOfProduct) {
        this.email = email;
        this.name = name;
        this.listOfProduct = listOfProduct;
        id++;
    }



    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Client.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getListOfProduct() {
        return listOfProduct;
    }

    public void setListOfProduct(List<Product> listOfProduct) {
        this.listOfProduct = listOfProduct;
    }

    public static class Product{
    private String name;

        public Product(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

