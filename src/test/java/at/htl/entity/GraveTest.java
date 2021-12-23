package at.htl.entity;

import at.htl.control.GraveRepository;
import io.quarkus.test.junit.QuarkusTest;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;

class GraveTest {
    @Inject
    Logger logger;

    @Inject
    EntityManager em;

    @Inject
    GraveRepository graveRepository;

    @Test
    void createGrave(){
        Grave grave = new Grave(12.12);
        graveRepository.save(grave);
        assertThat(grave.getPrice()).isEqualTo(12.12);

    }
}