import { ContractsService } from './../../services/contracts.service';
import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-contract-delete',
  templateUrl: './contract-delete.component.html',
  styleUrls: ['./contract-delete.component.css']
})
export class ContractDeleteComponent implements OnInit {

  constructor(private dialogRef: MatDialogRef<ContractDeleteComponent>,
              @Inject(MAT_DIALOG_DATA) private data: any,
              private contractsService: ContractsService) { }

  ngOnInit() {
  }

  onYesClick(){
    this.contractsService.deleteContract(this.data.contract.id).subscribe(
      data => this.dialogRef.close()
    )
  }

}
