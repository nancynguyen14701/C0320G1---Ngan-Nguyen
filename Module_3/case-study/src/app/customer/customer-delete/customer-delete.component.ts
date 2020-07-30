import { CustomersService } from './../../services/customers.service';
import { EmployeesService } from './../../services/employees.service';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Component, OnInit, Inject } from '@angular/core';

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.css']
})
export class CustomerDeleteComponent implements OnInit {

  private customerName;

  constructor(private dialogRef: MatDialogRef<CustomerDeleteComponent>,
  @Inject (MAT_DIALOG_DATA) private data: any,
  private customersService: CustomersService
  ) { }

  ngOnInit() {

    this.customerName = this.data.customer1.name;

  }

  onYesClick(){
    this.customersService.deleteCustomerById(this.data.customer1.id).subscribe(data =>{
      this.dialogRef.close();
    })
  }

}
