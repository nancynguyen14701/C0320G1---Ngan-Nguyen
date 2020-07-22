

import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { MaterialModule } from './material/material.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { EmployeeComponent } from './employees/employee.component';
import { FacilitiesComponent } from './facilities/facilities.component';
import { CustomerComponent } from './customer/customer.component';
import { ContractsComponent } from './contracts/contracts.component';
import { DetailContractsComponent } from './detail-contracts/detail-contracts.component';

import { ContactComponent } from './contact/contact.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { DeleteConfirmComponent } from './delete-confirm/delete-confirm.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

import { HttpClientModule } from '@angular/common/http';

import { Ng2SearchPipeModule } from 'ng2-search-filter';



@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    FacilitiesComponent,
    CustomerComponent,
    ContractsComponent,
    DetailContractsComponent,    
    ContactComponent,
    
    PageNotFoundComponent,  

  
  ],
  // entryComponents: [DeleteConfirmComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    Ng2SearchPipeModule
  
    
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
