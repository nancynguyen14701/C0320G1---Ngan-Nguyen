package codegym.case_study.repositories;

import codegym.case_study.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findAllByNameContainingAndEmailContainingAndAddressContaining(String name, String email, String address);
}
