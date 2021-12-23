package at.htl.entity;

import at.htl.control.CustomerRepository;
import io.quarkus.test.junit.QuarkusTest;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class CustomerTest {

    @Inject
    Logger logger;

    @Inject
    EntityManager em;

    @Inject
    CustomerRepository customerRepository;

    @Test
    void createPerson() {
        Customer c1 = new Customer("Max");
        customerRepository.save(c1);

        assertThat(c1.getName()).isEqualTo("Max");
    }
}