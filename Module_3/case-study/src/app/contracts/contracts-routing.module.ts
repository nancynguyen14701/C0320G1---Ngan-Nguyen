import { ContractEditComponent } from './contract-edit/contract-edit.component';
import { ContractsListComponent } from './contracts-list/contracts-list.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContractAddComponent } from './contract-add/contract-add.component';
import { ContractDeleteComponent } from './contract-delete/contract-delete.component';


const routes: Routes = [
  {path: "contracts", component: ContractsListComponent},
  {path: "contracts/contract-add", component: ContractAddComponent},
  {path: "contracts/contract-edit/:id", component: ContractEditComponent}

];

@NgModule({ 

  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ContractsRoutingModule { }
