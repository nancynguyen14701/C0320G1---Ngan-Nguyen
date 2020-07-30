import { Router } from '@angular/router';
import { ContractsService } from './../../services/contracts.service';
import { CustomValidatorsService } from './../../services/custom-validators.service';
import { FacilitiesService } from './../../services/facilities.service';
import { EmployeesService } from './../../services/employees.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CustomersService } from './../../services/customers.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contract-add',
  templateUrl: './contract-add.component.html',
  styleUrls: ['./contract-add.component.css']
})
export class ContractAddComponent implements OnInit {

  private customers;
  private employees;
  private facilities;
  private total;
  private addContractForm: FormGroup

  constructor(private customersService: CustomersService,
              private employeesService: EmployeesService,
              private facilitiesService: FacilitiesService,
              private contractsService: ContractsService,
              private fb: FormBuilder,
              private customValidatorsService: CustomValidatorsService,
              private router: Router,) { }

  ngOnInit() {
   


    this.addContractForm = this.fb.group({
      startDate: ['', Validators.required],
      endDate: ['', Validators.required],
      deposit: ['', Validators.required],
      total: ['', Validators.required],
      facilityType: ['', Validators.required],
      customer: ['', Validators.required],
      employee: ['', Validators.required],
    }, {validators : [this.customValidatorsService.startDateEndDate] })


    



    this.customersService.getAllCustomers().subscribe(data =>{
        this.customers = data;
    })

    this.employeesService.getAllEmployees().subscribe(data =>{
      this.employees = data;
    })

    this.facilitiesService.getAllFacilities().subscribe(data =>{
      this.facilities = data;
    })

    

  } 

  retrieveData(){
    let startDate = this.addContractForm.value.startDate;
    let endDate = this.addContractForm.value.endDate;
    let facilityType = this.addContractForm.value.facilityType;

    this.total = this.contractsService.calculateTotal(startDate,endDate,facilityType);
    this.addContractForm.patchValue({total: this.total});
  }

  addNewContract(){
    this.contractsService.addNewContract(this.addContractForm.value).subscribe(data =>{
       this.router.navigateByUrl('contracts')
    })
  }
  

}
