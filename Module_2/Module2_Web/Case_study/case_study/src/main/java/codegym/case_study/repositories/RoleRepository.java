package codegym.case_study.repositories;

import codegym.case_study.entities.Role;
import codegym.case_study.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role,Long> {

     Set<Role> getRoleByName(String name);

}
