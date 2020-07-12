import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CoursesComponent } from './courses.component';
import { FontSizeEditorComponent } from './font-size-editor/font-size-editor.component';
import { PetProfileComponent } from './pet-profile/pet-profile.component';
import { AngularColorPickerComponent } from './angular-color-picker/angular-color-picker.component';
import { CalculatorComponent } from './calculator/calculator.component';


@NgModule({
  declarations: [
    AppComponent,
    CoursesComponent,
    FontSizeEditorComponent,
    PetProfileComponent,
    AngularColorPickerComponent,
    CalculatorComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
