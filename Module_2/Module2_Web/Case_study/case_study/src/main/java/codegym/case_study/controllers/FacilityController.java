package codegym.case_study.controllers;

import codegym.case_study.DTOconverter.ContractConverter;
import codegym.case_study.entities.Booking;
import codegym.case_study.entities.Facility;
import codegym.case_study.services.AttachFacilityService;
import codegym.case_study.services.FacilityService;
import codegym.case_study.services.FacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    FacilityService facilityService;
    @Autowired
    FacilityTypeService facilityTypeService;
    @Autowired
    AttachFacilityService attachFacilityService;


    @GetMapping("")
    public ModelAndView showAllFacilities(){
        return new ModelAndView("facility/list", "facilityList", facilityService.getAllFacilities());
    }
    @GetMapping("/add")
    public ModelAndView addFacilityForm(){
        ModelAndView modelAndView= new ModelAndView("facility/create","facility", new Facility());
        modelAndView.addObject("facilityTypeList", facilityTypeService.getAllFacilityTypes() );
        return modelAndView;
    }
    @PostMapping("/add")
    public ModelAndView addFacility(@Valid @ModelAttribute Facility facility, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("facility/create");
            modelAndView.addObject("facilityTypeList", facilityTypeService.getAllFacilityTypes());
            return modelAndView;
        }
        facilityService.addFacility(facility);
        return new ModelAndView("facility/list", "message", "Facility added!!");
    }
    @GetMapping("/edit/{id}")
    public ModelAndView editFacilityForm(@PathVariable Long id){
        ModelAndView modelAndView= new ModelAndView("facility/edit","facility", facilityService.findFacility(id));
        modelAndView.addObject("facilityTypeList", facilityTypeService.getAllFacilityTypes());
        return modelAndView;
    }
    @PostMapping("/edit")
    public ModelAndView editFacility(@ModelAttribute Facility facility){
        facilityService.editFacility(facility);
        return new ModelAndView("facility/list", "message", "Facility edited successfully!!");
    }
    @GetMapping("/delete/{id}")
    public ModelAndView deleteFacilityForm(@PathVariable Long id){
        ModelAndView modelAndView= new ModelAndView("facility/delete","facility", facilityService.findFacility(id));
        modelAndView.addObject("facilityTypeList", facilityTypeService.getAllFacilityTypes());
        return modelAndView;
    }
    @PostMapping("/delete/{id}")
    public ModelAndView deleteFacility(@PathVariable Long id){
        facilityService.deleteFacility(id);
        return new ModelAndView("test1", "message", "Facility deleted successfully!!");
    }
    @GetMapping("/booking/{id}")
    public ModelAndView bookingForm(@PathVariable Long id){
        Facility facility= facilityService.findFacility(id);
        Booking booking= new Booking();
        booking.setServiceCode(facility.getCode());
       ModelAndView modelAndView = new ModelAndView("booking", "booking", booking);
       modelAndView.addObject("attachFacilityList", attachFacilityService.getAllAttachFacilities() );
       modelAndView.addObject("facility", facilityService.findFacility(id));
       return modelAndView;
    }
//    @PostMapping("/booking")
//    public ModelAndView createContract(@ModelAttribute Booking booking){
//        contractConverter.bookingToContract(booking);
//
//    }
}
