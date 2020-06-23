package codegym.webservices.controllers;

import codegym.webservices.entities.Customer;
import codegym.webservices.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> retrieveAllCustomers(){
        List<Customer> customerList= customerService.findAll();
        Customer customer1= new Customer("abc", "Nguyen");
        customerList.add(customer1);
        if(customerList.isEmpty()){
            return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
    }
//    @GetMapping("/customers")
//    public List<Customer> retrieveAllCustomers(){
//        return customerService.findAll();
//    }
    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> retrieveCustomerById(@PathVariable Long id){
        Customer customer= customerService.findById(id);
        if(customer==null){
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }
    @PostMapping("/create")
    public void createCustomer(@RequestBody Customer customer){
        customerService.save(customer);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id , @RequestBody Customer customer){
        Customer currentCustomer = customerService.findById(id);

        if (currentCustomer== null){
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        currentCustomer.setFirstName(customer.getFirstName());
        currentCustomer.setLastName(customer.getLastName());
        currentCustomer.setId(customer.getId());
        customerService.save(customer);
        return new ResponseEntity<Customer>(HttpStatus.OK);

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id){
        Customer currentCustomer= customerService.findById(id);
        if(currentCustomer == null){
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        customerService.remove(currentCustomer);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }



}
