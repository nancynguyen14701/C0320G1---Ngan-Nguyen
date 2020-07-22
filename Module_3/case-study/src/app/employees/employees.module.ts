import { DeleteConfirmComponent } from './../delete-confirm/delete-confirm.component';
import { MaterialModule } from './../material/material.module';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { EmployeesListComponent } from './employee-list/employee-list.component';
import { EmployeeAddComponent } from './employee-add/employee-add.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EmployeesRoutingModule } from './employees-routing.module';


import { Ng2SearchPipeModule } from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';
import { EmployeeEditComponent } from './employee-edit/employee-edit.component';
import { EmployeeDetailComponent } from './employee-detail/employee-detail.component';



@NgModule({
  declarations: [
    EmployeeAddComponent,
    EmployeesListComponent,
    DeleteConfirmComponent,
    EmployeeEditComponent,
    EmployeeDetailComponent
   
   
  ],
  entryComponents: [DeleteConfirmComponent, EmployeeDetailComponent],
  imports: [
    CommonModule,
    EmployeesRoutingModule,
    ReactiveFormsModule, 
    MaterialModule,
    FormsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule
  ]
})
export class EmployeesModule { }
