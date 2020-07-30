import { NgxPaginationModule } from 'ngx-pagination';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { CustomerAddComponent } from './customer-add/customer-add.component';
import { MaterialModule } from './../material/material.module';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CustomerRoutingModule } from './customer-routing.module';
import { CustomerEditComponent } from './customer-edit/customer-edit.component';
import { CustomerDeleteComponent } from './customer-delete/customer-delete.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';


@NgModule({
  declarations: [
    CustomerAddComponent,
    CustomerListComponent,
    CustomerEditComponent,
    CustomerDeleteComponent,
    CustomerDetailsComponent
  ],
  imports: [
    CommonModule,
    CustomerRoutingModule,
    ReactiveFormsModule,
    FormsModule, 
    MaterialModule,
    Ng2SearchPipeModule,
    NgxPaginationModule
  ],
  entryComponents: [CustomerDeleteComponent, CustomerDetailsComponent]
})
export class CustomerModule { }
