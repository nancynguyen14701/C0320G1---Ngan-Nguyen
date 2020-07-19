import { CustomerAddComponent } from './customer/customer-add/customer-add.component';
import { FacilityAddComponent } from './facilities/facility-add/facility-add.component';
import { HomeComponent } from './home/home.component';

import { EmployeeAddComponent } from './employees/employee-add/employee-add.component';
import { DetailContractsComponent } from './detail-contracts/detail-contracts.component';
import { ContractsComponent } from './contracts/contracts.component';
import { CustomerComponent } from './customer/customer.component';
import { FacilitiesComponent } from './facilities/facilities.component';
import { AppComponent } from './app.component';
import { EmployeesComponent } from './employees/employees.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContactComponent } from './contact/contact.component';
import { ContractAddComponent } from './contracts/contract-add/contract-add.component';


const routes: Routes = [
  
  {path: "employees", component: EmployeesComponent},
  {path: "employee-add", component: EmployeeAddComponent},
  {path: "facilities", component: FacilitiesComponent},
  {path: "facility-add", component: FacilityAddComponent},
  {path: "customers", component: CustomerComponent},
  {path: "customer-add", component: CustomerAddComponent},
  {path: "contracts", component: ContractsComponent},
  {path: "contract-add", component: ContractAddComponent},
  {path: "detail-contracts", component: DetailContractsComponent},
  {path: "contacts", component: ContactComponent},
  {path: "home", component: HomeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
