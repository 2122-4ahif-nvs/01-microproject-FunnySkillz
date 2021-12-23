package at.htl.control;

import at.htl.entity.Customer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerRepository {
    @Inject
    EntityManager em;

    //CRUD
    @Transactional
    public Customer save(Customer customer) {
        return em.merge(customer);
    }

}
