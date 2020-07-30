import { FacilitiesDeleteComponent } from './../facilities-delete/facilities-delete.component';
import { DeleteConfirmComponent } from './../../delete-confirm/delete-confirm.component';
import { MatDialog } from '@angular/material/dialog';

import { FacilitiesService } from './../../services/facilities.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-facilities-list',
  templateUrl: './facilities-list.component.html',
  styleUrls: ['./facilities-list.component.css']
})
export class FacilitiesListComponent implements OnInit {
   private facilities;
   private deleteFac;

  constructor(private facilityServices: FacilitiesService,
              private dialog: MatDialog) { }

  ngOnInit() {
     this.facilityServices.getAllFacilities().subscribe(data =>
      {
        this.facilities = data;
      })
  }

  openDialog(facility){
      this.deleteFac = facility
      const dialogRef = this.dialog.open(FacilitiesDeleteComponent,{
        width: "400px",
        data: {fac: this.deleteFac,
        disableClose: true}
      });

      dialogRef.afterClosed().subscribe(data =>{
        if(data !== "action"){
         this.facilities = this.facilities.filter(
           t => t.id !== facility.id
         )
        }
      })

      
  }

}
