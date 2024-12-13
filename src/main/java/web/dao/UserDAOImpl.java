package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Transactional(readOnly = true)
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getAll() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User getById(Integer id) {
        return entityManager.find(User.class, id);

    }

    @Transactional
    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        User user = entityManager.find(User.class, id);
        if (user != null){
            entityManager.remove(user);
        }
    }


}
