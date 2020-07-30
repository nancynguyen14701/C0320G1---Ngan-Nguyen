import { HttpClient } from '@angular/common/http';
import { ICustomer } from './../interface/ICustomer';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomersService {

  private readonly API_URL:string = "http://localhost:3000/customers"

  constructor(private http: HttpClient) { }

  getAllCustomers(): Observable<ICustomer[]>{
    return this.http.get<ICustomer[]>(this.API_URL);
  }

  getCustomerById(id: number): Observable<ICustomer>{
    return this.http.get<ICustomer>(this.API_URL +'/'+ id)
  }

  addNewCustomer(customer: ICustomer): Observable<any>{
    return this.http.post(this.API_URL, customer);
  }

  deleteCustomerById(id: number): Observable<any>{
    return this.http.delete(this.API_URL + '/' + id);
  }

  editCustomer(customer: ICustomer, id: number): Observable<any>{
    return this.http.put(this.API_URL + '/' + id , customer);
  }
}
