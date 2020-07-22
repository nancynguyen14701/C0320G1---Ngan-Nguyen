import { FacilitiesListComponent } from './facilities-list/facilities-list.component';

import { FacilityAddComponent } from './facility-add/facility-add.component';
import { MaterialModule } from './../material/material.module';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FacilitiesRoutingModule } from './facilities-routing.module';


@NgModule({
  declarations: [
    FacilityAddComponent,
    FacilitiesListComponent
  ],
  imports: [
    CommonModule,
    FacilitiesRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    MaterialModule
  ]
})
export class FacilitiesModule { }
