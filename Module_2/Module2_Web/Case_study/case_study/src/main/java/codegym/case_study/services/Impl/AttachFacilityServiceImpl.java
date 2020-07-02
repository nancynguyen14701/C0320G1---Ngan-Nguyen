package codegym.case_study.services.Impl;

import codegym.case_study.entities.AttachFacility;
import codegym.case_study.repositories.AttachFacilityRepository;
import codegym.case_study.services.AttachFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityServiceImpl implements AttachFacilityService {
    @Autowired
    AttachFacilityRepository attachFacilityRepository;
    @Override
    public List<AttachFacility> getAllAttachFacilities() {
        return attachFacilityRepository.findAll();
    }

    @Override
    public AttachFacility findAttachFacilityById(Long id) {
        return attachFacilityRepository.findById(id).orElse(null);
    }
}
