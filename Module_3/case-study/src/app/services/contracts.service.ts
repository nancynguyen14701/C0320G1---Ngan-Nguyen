import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IContract } from '../interface/IContract';
import { totalmem } from 'os';

@Injectable({
  providedIn: 'root'
})
export class ContractsService {

  private readonly API_URL = "http://localhost:3000/contracts"

  constructor(private http: HttpClient) { }

  getAllContracts(): Observable<IContract[]>{
    return this.http.get<IContract[]>(this.API_URL);
  }

  getContractById(id: number):Observable<IContract>{
    return this.http.get<IContract>(this.API_URL + '/' + id)
  }

  editContract(contract: IContract, id: number): Observable<any>{
    return this.http.put<IContract>(this.API_URL +'/'+ id, contract)
  }

  deleteContract(id: number): Observable<any>{
    return this.http.delete(this.API_URL + '/' + id)
  }

  addNewContract(contract: IContract): Observable<any>{
    return this.http.post<any>(this.API_URL, contract);
  }

  calculateTotal(startDate, endDate, facilityType):number{    

    let start = new Date (startDate).valueOf();
    let end = new Date (endDate).valueOf();



    
    let days = Math.floor((end - start)/ 1000/ 60/ 60/ 24)
    let total = 0;
    if (facilityType === 'Villa'){
        total = 600 * days;
    } 
    if (facilityType === 'House'){
       total = 400 * days;
    } 
    if (facilityType === 'Room'){
      total = 200 * days;
    }

    return total;

  }


}
