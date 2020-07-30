import { AbstractControl, FormGroup } from '@angular/forms';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomValidatorsService {

  constructor() { }

  ageValidator(control: AbstractControl){
    const now: any = new Date().valueOf();
    const birthday: any = new Date(control.value).valueOf();
    console.log(birthday);
    return (now - birthday) / ( 365.25 * 24 * 3600 * 1000) < 18 ? { age: true} : null;
  }

  startDateEndDate(control: AbstractControl){
    
    const startDate = new Date(control.get('startDate').value).valueOf();
    const endDate = new Date(control.get('endDate').value).valueOf();
   
    
    return (endDate < startDate)? { date: true} : null;    
  }


}
