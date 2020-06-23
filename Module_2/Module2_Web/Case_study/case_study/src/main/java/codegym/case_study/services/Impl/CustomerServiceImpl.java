package codegym.case_study.services.Impl;

import codegym.case_study.entities.Customer;
import codegym.case_study.repositories.CustomerRepository;
import codegym.case_study.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override

    public List<Customer> getAllCustomers() {
       return customerRepository.findAll();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findCustomer(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void edit(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
