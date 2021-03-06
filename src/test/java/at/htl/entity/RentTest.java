package at.htl.entity;

import at.htl.control.GraveRepository;
import at.htl.control.RentRepository;
import io.quarkus.test.junit.QuarkusTest;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class RentTest {

    @Inject
    Logger logger;

    @Inject
    EntityManager em;

    @Inject
    RentRepository rentRepository;

    @Test
    void createGrave(){
        Rent rent = new Rent();

    }
}