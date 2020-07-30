import { FacilitiesService } from './../../services/facilities.service';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Component, OnInit, Inject } from '@angular/core';

@Component({
  selector: 'app-facilities-delete',
  templateUrl: './facilities-delete.component.html',
  styleUrls: ['./facilities-delete.component.css']
})
export class FacilitiesDeleteComponent implements OnInit {
  private facilityName;
  constructor(private dialogRef: MatDialogRef<FacilitiesDeleteComponent>,
              @Inject (MAT_DIALOG_DATA) private data: any,
              private facilitiesService: FacilitiesService) { }

  ngOnInit() {
      this.facilityName = this.data.fac.name;

  }

  onYesClick(){
    this.facilitiesService.deleteFacility(this.data.fac.id).subscribe(data =>{
      this.dialogRef.close();
    })
  }

}
