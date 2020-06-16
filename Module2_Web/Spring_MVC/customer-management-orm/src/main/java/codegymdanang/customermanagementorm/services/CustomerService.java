package codegymdanang.customermanagementorm.services;

import codegymdanang.customermanagementorm.models.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAllCustomers();

    Optional<Customer> findCustomersById(Long id);

    void saveCustomers(Customer customer);

    void removeCustomers(Long id);

}
