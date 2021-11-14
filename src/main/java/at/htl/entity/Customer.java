package at.htl.entity;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;
import java.time.LocalDate;

public class Customer {

    @JsonbProperty("customer_name")
    private String name;

    @JsonbDateFormat("yyyy-MM-dd")
    private LocalDate dob;

    //region Constructors
    public Customer(String name, LocalDate dob) {
        this.name = name;
    }

    public Customer() {
    }
    //endregion

    //region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    //endregion


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
