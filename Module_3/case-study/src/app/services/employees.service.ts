

import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IEmployee } from '../interface/IEmployee';


@Injectable({
  providedIn: 'root'
})
export class EmployeesService {
  private readonly API_URL: string = 'http://localhost:3000/employees';

  constructor(private http: HttpClient) { }

  // httpOptions = {

  //   headers: new HttpHeaders ({
  //     'Content-Type': 'application/json'
  //   })
  // }

  getAllEmployees(): Observable<IEmployee[]> {
    return this.http.get<IEmployee[]>(this.API_URL);
  }

  getEmployeeById(employeeId: number): Observable<IEmployee>{
    return this.http.get<IEmployee>(`${this.API_URL}/${employeeId}`);
  }

  addNewEmployee(employee: IEmployee): Observable<any>{
    return this.http.post(this.API_URL, employee)
  }

  deleteEmployee(id: number): Observable<any> {
    return this.http.delete(`${this.API_URL}/${id}`);
  }

  editEmployee(employee, employeeId): Observable<any>{
    return this.http.put(`${this.API_URL}/${employeeId}`, employee)

  }


}
