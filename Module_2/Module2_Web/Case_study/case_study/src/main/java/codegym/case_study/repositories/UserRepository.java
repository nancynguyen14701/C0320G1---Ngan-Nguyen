package codegym.case_study.repositories;

import codegym.case_study.entities.Role;
import codegym.case_study.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
     User getUserByUsername(String username);


}
