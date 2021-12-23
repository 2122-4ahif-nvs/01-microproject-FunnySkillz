package at.htl.control;

import at.htl.entity.Rent;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class RentRepository {
    @Inject
    EntityManager em;

    @Transactional
    public Rent save(Rent rent){
        return em.merge(rent);
    }
}
