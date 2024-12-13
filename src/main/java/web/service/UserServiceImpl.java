package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public void saveUser(User user) {
        userDAO.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAll() {
        return userDAO.getAll();
    }

    @Transactional(readOnly = true)
    @Override
    public User getById(Integer id) {
        return userDAO.getById(id);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public void delete(Integer id) {
        userDAO.delete(id);
    }
}
