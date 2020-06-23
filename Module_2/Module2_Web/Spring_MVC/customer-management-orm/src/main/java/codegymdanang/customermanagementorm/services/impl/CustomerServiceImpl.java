package codegymdanang.customermanagementorm.services.impl;

import codegymdanang.customermanagementorm.models.Customer;
import codegymdanang.customermanagementorm.repositories.CustomerRepository;
import codegymdanang.customermanagementorm.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }
    @Override

    public Optional<Customer> findCustomersById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void saveCustomers(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void removeCustomers(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(firstName,pageable);
    }


}
