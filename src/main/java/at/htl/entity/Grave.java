package at.htl.entity;

import javax.json.bind.annotation.JsonbProperty;

public class Grave {

    @JsonbProperty("customer_name")
    private double price;

    public double getPrice() {
        return price;
    }

    public Grave(double price) {
        this.price = price;
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
