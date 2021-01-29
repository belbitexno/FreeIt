package homework20;

import java.io.*;
import java.util.List;
import java.util.Objects;

public class Client implements Serializable{

    private final long idClient;
    private String email;
    private String name;
    private List<Product> listOfProduct;

    public Client(String email, String name,List<Product> listOfProduct){
        this.email = email;
        this.name = name;
        this.listOfProduct = listOfProduct;
        ClientRepository.id++;
        this.idClient = ClientRepository.id;

    }

    public long getIdClient() {
        return idClient;
    }


    public String getEmail() {
        return email;
    }


    public String getName() {
        return name;
    }


    public List<Product> getListOfProduct() {
        return listOfProduct;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return idClient == client.idClient &&
                Objects.equals(email, client.email) &&
                Objects.equals(name, client.name) &&
                Objects.equals(listOfProduct, client.listOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, email, name, listOfProduct);
    }

    @Override
    public String toString() {
        return "id:" + idClient + ", email: " + email + ", name: " + name
                + ", покупки: ";
    }
}

