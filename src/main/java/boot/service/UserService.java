package boot.service;

import boot.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findUserById(Long id);

    void save(User user);

    void update(Long id, User user);

    void delete(Long id);
}
