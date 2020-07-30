

import { EmployeesService } from './../../services/employees.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import {Router, ActivatedRoute} from '@angular/router'


@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {
  private maxDate = new Date();
  private editEmployeeForm : FormGroup
  private employeeId;

  constructor( 
    private fb: FormBuilder, 
    private employeesService: EmployeesService,
    private activatedRoute : ActivatedRoute,
    private router: Router
   ) { }

  ngOnInit() {
    this.editEmployeeForm = this.fb.group({
      name: ['', [Validators.required]],
      position: ['', [Validators.required]],
      academicLevel: ['', [Validators.required]],
      department: ['', [Validators.required]],
      phoneNumber: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      salary: ['', [Validators.required]],
      address: ['', [Validators.required]],
      birthday: ['', [Validators.required]],
    })

    this.activatedRoute.params.subscribe(data =>{
      this.employeeId = data.id;
      this.employeesService.getEmployeeById(this.employeeId).subscribe(data =>{
        this.editEmployeeForm.patchValue(data);
      })

      

      
    })
    
  }

  onSubmit(){
    
  }

  editEmployee(){
    this.employeesService.editEmployee(this.editEmployeeForm.value, this.employeeId).subscribe(data => {
      this.router.navigateByUrl('employees');
    })
  }

 
}
