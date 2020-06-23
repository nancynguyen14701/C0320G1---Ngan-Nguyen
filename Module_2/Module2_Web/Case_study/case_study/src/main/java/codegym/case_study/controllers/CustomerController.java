package codegym.case_study.controllers;

import codegym.case_study.entities.Customer;
import codegym.case_study.repositories.CustomerRepository;
import codegym.case_study.services.CustomerService;
import codegym.case_study.services.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;
    @GetMapping("")
    public String getHomePage(){
        return "index";
    }
    @GetMapping("/register")
    public ModelAndView signUpForm(){
        ModelAndView modelAndView= new ModelAndView("signup");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("customerTypeList",customerTypeService.getAllCustomerTypes());
        return modelAndView;
    }
    @PostMapping("/register")
    public ModelAndView addCustomer(@ModelAttribute Customer customer){
        customerService.add(customer);
        return new ModelAndView("index","message","Signed up successfully!!!");
    }

}
