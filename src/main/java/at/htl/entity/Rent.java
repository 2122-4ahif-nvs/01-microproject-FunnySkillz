package at.htl.entity;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Grave grave;

    @JsonbDateFormat("yyyy-MM-dd")
    private LocalDateTime startDateTime;
    @JsonbDateFormat("yyyy-MM-dd")
    private LocalDateTime endDateTime;
    private double discount;

    public Grave getGrave() {
        return grave;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //region constructors
    public Rent(Customer customer, Grave grave, LocalDateTime startDateTime, LocalDateTime endDateTime, double discount) {
        this.customer = customer;
        this.grave = grave;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.discount = discount;
    }

    public Rent() {
    }
    //endregion

    //region getters and setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Grave getVehicle() {
        return grave;
    }

    public void setVehicle(Grave vehicle) {
        this.grave = vehicle;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    //endregion

    @Override
    public String toString() {
        return "Rent{" +
                "customer=" + customer +
                ", grave=" + grave +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", discount=" + discount +
                '}';
    }
}
