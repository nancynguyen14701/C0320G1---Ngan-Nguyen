import { CustomerListComponent } from './customer/customer-list/customer-list.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContactComponent } from './contact/contact.component';



const routes: Routes = [

  {path: "", redirectTo: 'customer', pathMatch: "full"},
  {path: "", loadChildren: './employees/employees.module#EmployeesModule'},

  {path: "", loadChildren: './customer/customer.module#CustomerModule'},

  {path: "", loadChildren: './contracts/contracts.module#ContractsModule'},

  {path: "", loadChildren: './facilities/facilities.module#FacilitiesModule'}, 
  

  

  
  
 
  
  {path: "contacts", component: ContactComponent},
 
  {path: "**", component: PageNotFoundComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
