import { ContractAddComponent } from './contract-add/contract-add.component';
import { MaterialModule } from './../material/material.module';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ContractsRoutingModule } from './contracts-routing.module';
import { ContractsListComponent } from './contracts-list/contracts-list.component';


@NgModule({
  declarations: [
    ContractsListComponent,
    ContractAddComponent,
    ],
  imports: [
    CommonModule,
    ContractsRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    MaterialModule
  ]
})
export class ContractsModule { }
