package codegym.case_study.services;

import codegym.case_study.entities.FacilityType;

import java.util.List;

public interface FacilityTypeService {

    List<FacilityType> getAllFacilityTypes();

    FacilityType findFacilityType(Long id);

    void editFacilityType(FacilityType facilityType);

}
