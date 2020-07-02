package codegym.case_study.repositories;

import codegym.case_study.entities.Customer;
import codegym.case_study.entities.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Long> {

    }
