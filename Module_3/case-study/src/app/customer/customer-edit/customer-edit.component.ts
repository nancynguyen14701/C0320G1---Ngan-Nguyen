import { CustomValidatorsService } from './../../services/custom-validators.service';
import { CustomersService } from './../../services/customers.service';
import { ActivatedRoute, Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {

  editCustomerForm : FormGroup
  private customerId;
  customer;

  constructor(private fb: FormBuilder,
              private route: ActivatedRoute,
              private customersService: CustomersService,
              private router: Router,
              private customValidatorsService: CustomValidatorsService) { }

  ngOnInit() {

    this.editCustomerForm = this.fb.group({
      name: ['', [Validators.required]],
      customerType: ['', [Validators.required]],
      cardNumber: ['', [Validators.required]],
      phoneNumber: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      address: ['', [Validators.required]],
      birthday: ['', [Validators.required, this.customValidatorsService.ageValidator]],
    })

    this.route.params.subscribe(data =>{
      this.customerId = data.id;
      this.customersService.getCustomerById(this.customerId).subscribe(data => {
        console.log(data);
        
        this.editCustomerForm.patchValue(data);
      })
      
    })
  }

  editCustomer(){
    this.customersService.editCustomer(this.editCustomerForm.value, this.customerId).subscribe(data =>{
          this.router.navigateByUrl('customer')
    })
    

  }

}
