package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    User getUserById(int id);
    void createUser(User user);
    void updateUser(User user);
    void deleteUserById(int id);
}
