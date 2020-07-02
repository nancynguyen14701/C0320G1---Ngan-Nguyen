package codegym.case_study.services.Impl;

import codegym.case_study.entities.FacilityType;
import codegym.case_study.repositories.FacilityTypeRepository;
import codegym.case_study.services.FacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacilityTypeServiceImpl implements FacilityTypeService {

    @Autowired
    FacilityTypeRepository facilityTypeRepository;
    @Override
    public List<FacilityType> getAllFacilityTypes() {
        return facilityTypeRepository.findAll();
    }

    @Override
    public FacilityType findFacilityType(Long id) {
        return facilityTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void editFacilityType(FacilityType facilityType) {
            facilityTypeRepository.save(facilityType);
    }
}
