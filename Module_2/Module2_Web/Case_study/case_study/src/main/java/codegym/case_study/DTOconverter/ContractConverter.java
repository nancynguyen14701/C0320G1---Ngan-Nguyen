package codegym.case_study.DTOconverter;

import codegym.case_study.entities.AttachFacility;
import codegym.case_study.entities.Booking;
import codegym.case_study.entities.Contract;
import codegym.case_study.services.AttachFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContractConverter {
    @Autowired
    AttachFacilityService attachFacilityService;
    Contract contract= new Contract();
    public Contract bookingToContract(Booking booking){
        contract.setStartDate(booking.getStartDate());
        contract.setEndDate(booking.getEndDate());
        List<AttachFacility> attachFacilities = new ArrayList<>();
        for(String attachService : booking.getAttachFacilityList()){
           attachFacilities.add(attachFacilityService.findAttachFacilityById(Long.parseLong(attachService)));
        }
        contract.setAttachFacilityList(attachFacilities);
        contract.setFacilityCode(booking.getServiceCode());
        contract.setDeposit("We all know ha");
        return contract;
    }

}
