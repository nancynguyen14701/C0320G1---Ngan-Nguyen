package codegymdanang.customermanagementorm.services;

import codegymdanang.customermanagementorm.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
   List<Customer> findAllCustomers();

    Optional<Customer> findCustomersById(Long id);

    void saveCustomers(Customer customer);

    void removeCustomers(Long id);

    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);

}
