package clients;

import java.util.ArrayList;
import java.util.List;

public class Client {


    private String name;
    private String address;
    private List<Visits> visits = new ArrayList<>();

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVisit (String type, int startingTime, int length) {
        visits.add(new Visits(type, startingTime, length)); //Kan man göra så här??
    }

}
