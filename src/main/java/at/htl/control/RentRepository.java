package at.htl.control;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class RentRepository {
    @Inject
    EntityManager em;

}
