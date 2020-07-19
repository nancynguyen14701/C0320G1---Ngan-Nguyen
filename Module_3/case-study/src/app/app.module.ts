import { MaterialModule } from './material/material.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeesComponent } from './employees/employees.component';
import { FacilitiesComponent } from './facilities/facilities.component';
import { CustomerComponent } from './customer/customer.component';
import { ContractsComponent } from './contracts/contracts.component';
import { DetailContractsComponent } from './detail-contracts/detail-contracts.component';
import { EmployeeAddComponent } from './employees/employee-add/employee-add.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FacilityAddComponent } from './facilities/facility-add/facility-add.component';
import { CustomerAddComponent } from './customer/customer-add/customer-add.component';
import { ContractAddComponent } from './contracts/contract-add/contract-add.component';






@NgModule({
  declarations: [
    AppComponent,
    EmployeesComponent,
    FacilitiesComponent,
    CustomerComponent,
    ContractsComponent,
    DetailContractsComponent,
    EmployeeAddComponent,
    ContactComponent,
    HomeComponent,
    FacilityAddComponent,
    CustomerAddComponent,
    ContractAddComponent,
  

   
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule
    
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
