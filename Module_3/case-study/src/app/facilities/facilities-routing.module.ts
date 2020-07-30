import { FacilitiesEditComponent } from './facilities-edit/facilities-edit.component';
import { FacilityAddComponent } from './facility-add/facility-add.component';
import { FacilitiesListComponent } from './facilities-list/facilities-list.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  {path: "facilities", component: FacilitiesListComponent},
  {path: "facilities/facility-add", component: FacilityAddComponent},
  {path: "facilities/facility-edit/:id", component: FacilitiesEditComponent}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class FacilitiesRoutingModule { }
