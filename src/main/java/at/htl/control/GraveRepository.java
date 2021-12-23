package at.htl.control;

import at.htl.entity.Grave;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class GraveRepository {
    @Inject
    EntityManager em;

    @Transactional
    public Grave save(Grave grave){
        return em.merge(grave);
    }
}
