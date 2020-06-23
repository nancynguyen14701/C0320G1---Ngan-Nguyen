package codegym.webservices.services;

import codegym.webservices.entities.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Customer customer);
}
