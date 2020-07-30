import { CustomValidatorsService } from './../../services/custom-validators.service';
import { Router } from '@angular/router';
import { CustomersService } from './../../services/customers.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.css']
})
export class CustomerAddComponent implements OnInit {

  addCustomerForm : FormGroup;
  private customer;
  

  constructor(private fb: FormBuilder,
              private customersService: CustomersService,
              private router: Router,
              private customValidatorsService: CustomValidatorsService) { }

  ngOnInit() {

    this.addCustomerForm = this.fb.group({
      name: ['', [Validators.required]],
      customerType: ['', [Validators.required]],
      cardNumber: ['', [Validators.required]],
      phoneNumber: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      address: ['', [Validators.required]],
      birthday: ['', [Validators.required, this.customValidatorsService.ageValidator]],
       
    })
  }

  addNewCustomer() {

    this.customersService.addNewCustomer(this.addCustomerForm.value).subscribe( data => 
       this.router.navigateByUrl('customer')         
    )
}

  

}
