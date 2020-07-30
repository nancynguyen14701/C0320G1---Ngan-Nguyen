import { NgxPaginationModule } from 'ngx-pagination';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { FacilitiesListComponent } from './facilities-list/facilities-list.component';

import { FacilityAddComponent } from './facility-add/facility-add.component';
import { MaterialModule } from './../material/material.module';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FacilitiesRoutingModule } from './facilities-routing.module';
import { FacilitiesDeleteComponent } from './facilities-delete/facilities-delete.component';
import { FacilitiesEditComponent } from './facilities-edit/facilities-edit.component';



@NgModule({
  declarations: [
    FacilityAddComponent,
    FacilitiesListComponent,
    FacilitiesDeleteComponent,
    FacilitiesEditComponent,
    
  ],
  imports: [
    CommonModule,
    FacilitiesRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    MaterialModule,
    Ng2SearchPipeModule,
    NgxPaginationModule
  ],
  entryComponents: [FacilitiesDeleteComponent]
})
export class FacilitiesModule { }
