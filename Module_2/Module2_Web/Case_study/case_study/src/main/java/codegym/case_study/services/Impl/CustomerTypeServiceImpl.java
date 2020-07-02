package codegym.case_study.services.Impl;

import codegym.case_study.entities.CustomerType;
import codegym.case_study.repositories.CustomerTypeRepository;
import codegym.case_study.services.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @Override
    public List<CustomerType> getAllCustomerTypes() {
        return customerTypeRepository.findAll();
    }

    @Override
    public CustomerType findCustomerTypeById(Long id) {
        return customerTypeRepository.findById(id).orElse(null);
    }
}
