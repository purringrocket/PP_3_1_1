package boot.dao;


import boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUserById(long id);

    void save(User user);

    void update(User user);

    void delete(long id);
}
