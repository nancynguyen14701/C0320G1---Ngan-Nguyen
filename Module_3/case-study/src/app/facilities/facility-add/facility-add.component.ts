import { Router } from '@angular/router';
import { FacilitiesService } from './../../services/facilities.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-facility-add',
  templateUrl: './facility-add.component.html',
  styleUrls: ['./facility-add.component.css']
})
export class FacilityAddComponent implements OnInit {

  private addFacilityForm: FormGroup

  constructor(private fb: FormBuilder,
              private facilitiesService: FacilitiesService,
              private router: Router) { }

  ngOnInit() {

    this.addFacilityForm = this.fb.group({
      id: ['',[Validators.required]],
      code: ['', [Validators.required]],
      area: ['', [Validators.required]],
      price: ['', [Validators.required]],
      maxCapacity: ['', [Validators.required]],
      facilityType: ['', [Validators.required]],
    })
  }

  addNewFacility(){
    this.facilitiesService.addNewFacility(this.addFacilityForm.value).subscribe(data =>{
        this.router.navigateByUrl('facilities');
    })

  }

}
