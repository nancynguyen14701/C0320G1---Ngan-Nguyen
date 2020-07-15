import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FontSizeEditorComponent } from './font-size-editor/font-size-editor.component';
import { PetProfileComponent } from './pet-profile/pet-profile.component';
import { AngularColorPickerComponent } from './angular-color-picker/angular-color-picker.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { NameCardComponent } from './name-card/name-card.component';
import { AngularProgressBarComponent } from './angular-progress-bar/angular-progress-bar.component';
import { RatingBarComponent } from './rating-bar/rating-bar.component';
import { CountdownComponent } from './countdown/countdown.component';

import { ToDoComponent } from './to-do/to-do.component';


@NgModule({
  declarations: [
    AppComponent,   
    FontSizeEditorComponent,
    PetProfileComponent,
    AngularColorPickerComponent,
    CalculatorComponent,
    NameCardComponent,
    AngularProgressBarComponent,
    RatingBarComponent,
    CountdownComponent,

    ToDoComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
