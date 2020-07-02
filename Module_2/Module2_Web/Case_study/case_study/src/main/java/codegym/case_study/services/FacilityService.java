package codegym.case_study.services;

import codegym.case_study.entities.Facility;

import java.util.List;

public interface FacilityService {

  List<Facility> getAllFacilities();

  Facility findFacility(Long id);

  void addFacility(Facility facility);

  void editFacility(Facility facility);

  void deleteFacility(Long id);

}
