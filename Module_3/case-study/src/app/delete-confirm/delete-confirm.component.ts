import { IEmployee } from 'src/app/interface/IEmployee';
import { EmployeesService } from './../services/employees.service';
import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-delete-confirm',
  templateUrl: './delete-confirm.component.html',
  styleUrls: ['./delete-confirm.component.css']
})
export class DeleteConfirmComponent implements OnInit {
  public employeeName;

  constructor(
    public dialogRef: MatDialogRef<DeleteConfirmComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public employeesService: EmployeesService) {}


  ngOnInit(): void {
    this.employeeName = this.data.employee1.name
    
  }

  onYesClick(): void {
    this.employeesService.deleteEmployee(this.data.employee1.id).subscribe(next =>{     
      this.dialogRef.close();      
    })
   

  

}
}
