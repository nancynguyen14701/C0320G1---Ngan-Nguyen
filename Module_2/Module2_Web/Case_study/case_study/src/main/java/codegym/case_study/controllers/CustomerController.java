package codegym.case_study.controllers;

import codegym.case_study.entities.Customer;
import codegym.case_study.entities.User;
import codegym.case_study.services.CustomerService;
import codegym.case_study.services.CustomerTypeService;
import codegym.case_study.validators.DateValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

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
    public ModelAndView addCustomer(@Valid @ModelAttribute Customer customer, BindingResult bindingResult){
        DateValidator dateValidator = new DateValidator();
        dateValidator.validate(customer, bindingResult);
        if(bindingResult.hasErrors()){
            ModelAndView modelAndView= new ModelAndView("signup");
            return modelAndView;
        }
        customerService.add(customer);
        ModelAndView modelAndView= new ModelAndView("user","message","Thank you for your information. Please choose your username and password");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @GetMapping("/showAll/page/{pageNumber}")
    public ModelAndView showAllCustomers(@PathVariable int pageNumber){
        Page<Customer> page= customerService.getAllCustomers(pageNumber-1);
        return new ModelAndView("list", "customerList", page);
    }
    @GetMapping("/edit/{id}")
    public ModelAndView editCustomerForm(@PathVariable Long id){
        ModelAndView modelAndView= new ModelAndView("edit", "customer", customerService.findCustomer(id));
        modelAndView.addObject("customerTypeList", customerTypeService.getAllCustomerTypes());
        return modelAndView;
    }
    @PostMapping("/edit")
    public ModelAndView editCustomer(@ModelAttribute Customer customer){
        customerService.edit(customer);
        return new ModelAndView("test1","message","Edited successfully!!!");
    }
    @GetMapping("/delete/{id}")
    public ModelAndView deleteCustomerForm(@PathVariable Long id){
        ModelAndView modelAndView= new ModelAndView("delete", "customer", customerService.findCustomer(id));
        modelAndView.addObject("customerTypeList", customerTypeService.getAllCustomerTypes());
        return modelAndView;
    }
    @PostMapping("delete/{id}")
    public ModelAndView deleteCustomer(@PathVariable Long id){
        customerService.delete(id);
        return new ModelAndView("test1", "message", "Customer deleted!");
    }
    @PostMapping("/search")
    public ModelAndView searchCustomer(@RequestParam(required = false, defaultValue = "") String name,
                                       @RequestParam(required = false, defaultValue = "") String email,
                                       @RequestParam(required = false, defaultValue = "") String address){

        return new ModelAndView("search", "customerList",customerService.search(name, email, address) );
    }




}
