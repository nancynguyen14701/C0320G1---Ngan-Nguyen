package codegym.case_study.services;

import codegym.case_study.entities.Contract;

import java.util.List;

public interface ContractService {
    void saveContract(Contract contract);
    List<Contract> getAllContracts();
    Contract findContractById(Long id);
    void deleteContract(Contract contract);
}
