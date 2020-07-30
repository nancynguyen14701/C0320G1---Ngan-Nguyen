import { ActivatedRoute, Router } from '@angular/router';
import { FacilitiesService } from './../../services/facilities.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-facilities-edit',
  templateUrl: './facilities-edit.component.html',
  styleUrls: ['./facilities-edit.component.css']
})
export class FacilitiesEditComponent implements OnInit {

  editFacilityForm: FormGroup;
  private facilityId;

  constructor(private fb: FormBuilder,
              private facilitiesService: FacilitiesService,
              private route: ActivatedRoute,
              private router: Router) { }

  ngOnInit() {

    this.editFacilityForm = this.fb.group({
      id: ['',[Validators.required]],
      code: ['', [Validators.required]],
      area: ['', [Validators.required]],
      price: ['', [Validators.required]],
      maxCapacity: ['', [Validators.required]],
      facilityType: ['', [Validators.required]],
    })

    this.route.params.subscribe(data =>{
      this.facilityId = data.id;
      this.facilitiesService.getFacilitiesById(this.facilityId).subscribe(data =>{
        this.editFacilityForm.patchValue(data);
      })
    })
  }

  

  editNewFacility(){
      this.facilitiesService.editFacility(this.editFacilityForm.value, this.facilityId).subscribe(data =>
        this.router.navigateByUrl('facilities')
      )
  }

}
