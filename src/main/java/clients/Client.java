package clients;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {


    private Long id; //Primary key?
    private String name;
    private String address;
    private List<Visits> visits = new ArrayList<>();


    public Client () {
        this.name = name;
        this.address = address;
        this.visits = visits;
    }

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVisit (String type, int startingTime, int length) {
        visits.add(new Visits(type, startingTime, length)); //Kan man göra så här??
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
