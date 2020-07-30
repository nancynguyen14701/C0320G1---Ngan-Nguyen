import { CustomersService } from './../../services/customers.service';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { Component, OnInit, Inject } from '@angular/core';

@Component({
  selector: 'app-customer-details',
  templateUrl: './customer-details.component.html',
  styleUrls: ['./customer-details.component.css']
})
export class CustomerDetailsComponent implements OnInit {

  private customer

  constructor(private dialogRef: MatDialogRef<CustomerDetailsComponent>,
      @Inject (MAT_DIALOG_DATA) private data: any,
      private CustomersService: CustomersService ) { }

  ngOnInit() {
   this.customer = this.data.detailCus;
  }

}
