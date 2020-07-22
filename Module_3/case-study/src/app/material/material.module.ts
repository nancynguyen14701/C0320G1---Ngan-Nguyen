import { NgModule, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatButtonModule } from '@angular/material/button';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatInputModule} from '@angular/material/input';
import { MatNativeDateModule } from '@angular/material/core'
import {MatIconModule} from '@angular/material/icon';
import { MatDialogModule } from '@angular/material/dialog';
import {MatPaginatorModule} from '@angular/material/paginator';

const MaterialComponents = [
  MatButtonModule,
  MatDatepickerModule,
  MatInputModule,
  MatNativeDateModule,
  MatIconModule,
  MatDialogModule,
  MatPaginatorModule
  
]

@NgModule({
  
  imports: [
    CommonModule,
    MaterialComponents
    
  ],
  exports: [
    MaterialComponents
  ]
})
export class MaterialModule { }
