package codegym.case_study.services;

import codegym.case_study.entities.AttachFacility;

import java.util.List;

public interface AttachFacilityService {
    List<AttachFacility> getAllAttachFacilities();
    AttachFacility findAttachFacilityById(Long id);
}
