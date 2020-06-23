package codegym.case_study.services;

import codegym.case_study.entities.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();
    void add(Customer customer);
    Customer findCustomer(Long id);
    void edit(Customer customer);
    void delete(Long id);
}
