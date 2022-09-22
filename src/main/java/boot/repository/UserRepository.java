package boot.repository;

import boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void findByNameStartingWith(String startingWith);

    void findByNameOrEmail(String name, String email);
}
