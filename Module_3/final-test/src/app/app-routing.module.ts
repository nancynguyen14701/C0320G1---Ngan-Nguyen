import { StudentListComponent } from './student-list/student-list.component';


import { PageNotFoundComponent } from './page-not-found/page-not-found.component';


import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { StudentEditComponent } from './student-edit/student-edit.component';


const routes: Routes = [
  
  {path: "", component: StudentListComponent},
  {path: "student-edit/:id", component: StudentEditComponent},
  {path: "**", component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
