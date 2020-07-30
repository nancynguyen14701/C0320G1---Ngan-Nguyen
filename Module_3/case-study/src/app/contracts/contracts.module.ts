import { NgxPaginationModule } from 'ngx-pagination';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { ContractAddComponent } from './contract-add/contract-add.component';
import { MaterialModule } from './../material/material.module';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ContractsRoutingModule } from './contracts-routing.module';
import { ContractsListComponent } from './contracts-list/contracts-list.component';
import { ContractDeleteComponent } from './contract-delete/contract-delete.component';
import { ContractDetailsComponent } from './contract-details/contract-details.component';
import { ContractEditComponent } from './contract-edit/contract-edit.component';


@NgModule({
  declarations: [
    ContractsListComponent,
    ContractAddComponent,
    ContractDeleteComponent,
    ContractDetailsComponent,
    ContractEditComponent,
    ],
  imports: [
    CommonModule,
    ContractsRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    MaterialModule, 
    Ng2SearchPipeModule,
    NgxPaginationModule
  ],
  entryComponents: [ContractDeleteComponent]
})
export class ContractsModule { }
