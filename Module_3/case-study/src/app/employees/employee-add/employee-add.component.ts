import { Router } from '@angular/router';
import { EmployeesService } from './../../services/employees.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { DatePipe } from '@angular/common';
import { IEmployee } from 'src/app/interface/IEmployee';
import { $ } from 'protractor';


@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent implements OnInit {
  private maxDate = new Date();
  private newEmployeeForm : FormGroup

  constructor( 
    private fb: FormBuilder, 
    private employeesService: EmployeesService,
    private router: Router) { }

  ngOnInit() {
    this.newEmployeeForm = this.fb.group({
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
    
  }

  onSubmit(){
    
  }

  addNewEmployee(){
    
    let employee = this.newEmployeeForm.value as IEmployee
    let datePipe = new DatePipe('en-Us')
     employee.birthday = datePipe.transform(employee.birthday, 'dd/MM/yyyy')

    this.employeesService.addNewEmployee(employee).subscribe(
      data => {
        this.router.navigateByUrl('employees');
        
      }
    )
      
  }

}
