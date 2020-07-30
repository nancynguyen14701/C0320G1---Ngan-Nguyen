import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';

import { NgxPaginationModule } from 'ngx-pagination';

import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { HttpClientModule } from '@angular/common/http';
import { MatDialogModule } from '@angular/material/dialog';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { StudentListComponent } from './student-list/student-list.component';
import { StudentEditComponent } from './student-edit/student-edit.component';
import { StudentDeleteComponent } from './student-delete/student-delete.component';









@NgModule({
  declarations: [
    AppComponent,
    PageNotFoundComponent,
    StudentListComponent,
    StudentEditComponent,
    StudentDeleteComponent,   
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatDialogModule,
    MatIconModule,
    MatButtonModule,
    HttpClientModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    ReactiveFormsModule,
    FormsModule,
    

  ],
  entryComponents: [StudentDeleteComponent],
 
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
