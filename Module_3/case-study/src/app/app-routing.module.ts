import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { FacilityAddComponent } from './facilities/facility-add/facility-add.component';



import { DetailContractsComponent } from './detail-contracts/detail-contracts.component';
import { ContractsComponent } from './contracts/contracts.component';


import { AppComponent } from './app.component';

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContactComponent } from './contact/contact.component';



const routes: Routes = [
  
  {path: "", loadChildren: './employees/employees.module#EmployeesModule'},

  {path: "", loadChildren: './customer/customer.module#CustomerModule'},

  {path: "", loadChildren: './contracts/contracts.module#ContractsModule'},

  {path: "", loadChildren: './facilities/facilities.module#FacilitiesModule'},  
  
  
  {path: "detail-contracts", component: DetailContractsComponent},
  
  {path: "contacts", component: ContactComponent},
 
  {path: "**", component: PageNotFoundComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
