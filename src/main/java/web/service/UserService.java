package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    List<User> getAll();
    User getById(Integer id);
    void update (User user);
    void delete (Integer id);
}
