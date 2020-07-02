package codegym.case_study.services.Impl;

import codegym.case_study.entities.Facility;
import codegym.case_study.repositories.FacilityRepository;
import codegym.case_study.services.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacilityServiceImpl implements FacilityService {
    @Autowired
    FacilityRepository facilityRepository;
    @Override
    public List<Facility> getAllFacilities() {
        return facilityRepository.findAll();
    }

    @Override
    public Facility findFacility(Long id) {
        return facilityRepository.findById(id).orElse(null);
    }

    @Override
    public void addFacility(Facility facility) {
        facilityRepository.save(facility);
    }

    @Override
    public void editFacility(Facility facility) {
        facilityRepository.save(facility);
    }

    @Override
    public void deleteFacility(Long id) {
        facilityRepository.deleteById(id);
    }
}
