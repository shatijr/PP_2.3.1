package web.dao;

import web.model.User;
import java.util.List;

public interface UserDAO {
    void save(User user);
    List <User> getAll();
    User getById(Integer id);
    void update (User user);
    void delete (Integer id);
}
