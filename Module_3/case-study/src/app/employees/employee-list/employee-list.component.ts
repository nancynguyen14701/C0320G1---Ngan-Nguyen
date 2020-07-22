import { EmployeeDetailComponent } from './../employee-detail/employee-detail.component';
import { IEmployee } from 'src/app/interface/IEmployee';

import { EmployeesService } from './../../services/employees.service';
import { DeleteConfirmComponent } from '../../delete-confirm/delete-confirm.component';
import { MatDialog, MatDialogRef } from '@angular/material/dialog';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-employees',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeesListComponent implements OnInit {

  public employees;
  public data1;
  public data2;

  constructor(public dialog : MatDialog,
              public employeesService: EmployeesService) { }

  ngOnInit() {
    this.employeesService.getAllEmployees().subscribe(
      data => {
      this.employees = data;      
    }     
    )
  }

  openDialog(employee){

    
  this.data1 = employee
      const dialogRef = this.dialog.open(DeleteConfirmComponent,{
        width: "400px",
        data: {employee1: this.data1},
        disableClose: true
        
      });
    
    
    
    dialogRef.afterClosed().subscribe(result =>{
     this.ngOnInit();
      
    })    
  }

  openDetailDialog(employee){
    this.data2 = employee
    const dialogReference = this.dialog.open (EmployeeDetailComponent, {
      width: "600px",
      data: {emp: this.data2}
    })
  }



 

}
