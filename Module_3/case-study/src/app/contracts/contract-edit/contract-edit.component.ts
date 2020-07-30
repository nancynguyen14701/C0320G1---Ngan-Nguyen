import { CustomValidatorsService } from './../../services/custom-validators.service';
import { ActivatedRoute, Router } from '@angular/router';
import { ContractsService } from './../../services/contracts.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contract-edit',
  templateUrl: './contract-edit.component.html',
  styleUrls: ['./contract-edit.component.css']
})
export class ContractEditComponent implements OnInit {

  editContractForm : FormGroup;
  private contractId;

  constructor(private fb: FormBuilder,
              private contractsService: ContractsService,
              private route: ActivatedRoute,
              private router: Router,
              private customValidatorsService: CustomValidatorsService) { }

  ngOnInit() {

    this.editContractForm = this.fb.group({
      startDate: ['', Validators.required],
      endDate: ['', Validators.required],
      deposit: ['', Validators.required],
      total: ['', Validators.required],
      facilityType: ['', Validators.required],
      customer: ['', Validators.required],
      employee: ['', Validators.required],
    }, {validators : [this.customValidatorsService.startDateEndDate] })


    this.route.params.subscribe(data =>{
      this.contractId = data.id;
      this.contractsService.getContractById(this.contractId).subscribe(data =>
        this.editContractForm.patchValue(data)
        )
    })
  }

  editContract(){
    this.contractsService.editContract(this.editContractForm.value, this.contractId).subscribe(data =>{
      this.router.navigateByUrl('contracts');
    })
  }

}
