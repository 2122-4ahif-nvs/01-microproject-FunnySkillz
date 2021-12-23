package at.htl.control;

import at.htl.entity.Customer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CustomerRepository {
    @Inject
    EntityManager em;

    //CRUD
    @Transactional
    public Customer save(Customer customer) {
        return em.merge(customer);
    }

    @Transactional
    public List<Customer> getAllCustomers(){
        var query = em
                .createQuery("select c from Customer c", Customer.class);
        return query.getResultList();
    }

    @Transactional
    public Customer getCustomerById(Long id) {
        var query = em
                .createQuery("select c from Customer c where c.id = :id", Customer.class);
        query.setParameter("id", id);
        return query.getResultStream().findFirst().orElse(null);
    }
}
