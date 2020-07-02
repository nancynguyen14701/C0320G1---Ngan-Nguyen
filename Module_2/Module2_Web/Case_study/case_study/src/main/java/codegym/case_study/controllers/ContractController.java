package codegym.case_study.controllers;

import codegym.case_study.DTOconverter.ContractConverter;
import codegym.case_study.entities.Booking;
import codegym.case_study.entities.Contract;
import codegym.case_study.services.ContractService;
import codegym.case_study.services.FacilityService;
import codegym.case_study.services.FacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    ContractConverter contractConverter;
    @Autowired
    ContractService contractService;
    @Autowired
    FacilityService facilityService;
    @Autowired
    FacilityTypeService facilityTypeService;
    @PostMapping("/booking")
    public ModelAndView createContract(@ModelAttribute Booking booking){
        Contract contract= contractConverter.bookingToContract(booking);
        contractService.saveContract(contract);
        ModelAndView modelAndView= new ModelAndView("facility/list", "message", "Your booking has been approved!!!");
        modelAndView.addObject("facilityList",facilityService.getAllFacilities());
        return modelAndView;
    }

}
