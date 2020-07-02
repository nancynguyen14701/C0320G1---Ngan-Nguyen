package codegym.case_study.services;

import codegym.case_study.entities.Customer;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CustomerService {

    Page<Customer> getAllCustomers(int pageNumber);
    void add(Customer customer);
    Customer findCustomer(Long id);
    void edit(Customer customer);
    void delete(Long id);
    List<Customer> search(String name, String email, String address);
}
