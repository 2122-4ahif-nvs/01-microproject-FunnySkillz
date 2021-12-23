package at.htl.entity;

import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.*;

@Entity
public class Grave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;

    public Grave() {

    }
    public Grave(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Grave{" +
                "price=" + price +
                '}';
    }
}
