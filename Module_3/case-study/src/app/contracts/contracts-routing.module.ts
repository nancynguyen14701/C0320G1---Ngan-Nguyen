import { ContractsListComponent } from './contracts-list/contracts-list.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContractAddComponent } from './contract-add/contract-add.component';


const routes: Routes = [
  {path: "contracts", component: ContractsListComponent},
  {path: "contracts/contract-add", component: ContractAddComponent}

];

@NgModule({ 

  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ContractsRoutingModule { }
