import { EmployeesService } from './../../services/employees.service';
import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-employee-detail',
  templateUrl: './employee-detail.component.html',
  styleUrls: ['./employee-detail.component.css']
})
export class EmployeeDetailComponent implements OnInit {
  private detailEmp;

  constructor(
    public dialogRef: MatDialogRef<EmployeeDetailComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public employeesService: EmployeesService) {}



    ngOnInit(): void {
      this.employeesService.getEmployeeById(this.data.emp.id).subscribe(data => this.detailEmp = data);
      
    }
  
  
  
 
  

}
