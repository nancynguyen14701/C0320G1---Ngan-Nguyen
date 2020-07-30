import { MatDialogRef, MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { ContractsService } from './../../services/contracts.service';
import { Component, OnInit } from '@angular/core';
import { ContractDeleteComponent } from '../contract-delete/contract-delete.component';

@Component({
  selector: 'app-contracts-list',
  templateUrl: './contracts-list.component.html',
  styleUrls: ['./contracts-list.component.css']
})
export class ContractsListComponent implements OnInit {

  private contracts;
  private delContract;

  constructor(private contractsService: ContractsService,
              private router: Router,
              private dialog: MatDialog) { }

  ngOnInit() {
    this.contractsService.getAllContracts().subscribe( data => {
      this.contracts = data;
      
    })

  }

  openDialog(contract){
      this.delContract = contract;
      const dialogRef = this.dialog.open(ContractDeleteComponent, {
          width : "400px",
          data: {contract: this.delContract},
          disableClose: true
      });

      dialogRef.afterClosed().subscribe(data =>{
        if(data!=="action"){
          this.contracts = this.contracts.filter(
            t => t.id !== contract.id
          )
        }
      })

      
  }
}
