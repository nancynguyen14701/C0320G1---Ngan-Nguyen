import { CustomerDetailsComponent } from './../customer-details/customer-details.component';
import { FacilitiesRoutingModule } from './../../facilities/facilities-routing.module';
import { CustomerDeleteComponent } from './../customer-delete/customer-delete.component';
import { MatDialog } from '@angular/material/dialog';
import { CustomersService } from './../../services/customers.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  private customers;
  private customerData;
  private detailCustomer;

  constructor(private customersService: CustomersService,
              private dialog: MatDialog) { }

  ngOnInit() {
   
      this.customersService.getAllCustomers().subscribe(data => {
        this.customers = data;
      })

   }

   openDialog(customer){
     this.customerData = customer;
     const dialogRef = this.dialog.open(CustomerDeleteComponent, {
       width: "400px",
       data: {customer1: this.customerData},
       disableClose: true

     })

     dialogRef.afterClosed().subscribe(data => {
      if (data !== "action" ){
       this.customers = this.customers.filter(
        t => t.id !== customer.id        
       )
      }
     })

   }

   openDetailDialog(customer){
     this.detailCustomer = customer;
    const dialogRef = this.dialog.open(CustomerDetailsComponent, {
      width: "600px",
      data: {detailCus: this.detailCustomer}
    })

  }

}
