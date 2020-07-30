import { IStudent } from './../IStudent';

import { Observable } from 'rxjs';

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StudentsService {

  private readonly API_URL:string = "http://localhost:3000/students"

  constructor(private http: HttpClient) { }

  getAllStudents(): Observable<IStudent[]>{
    return this.http.get<IStudent[]>(this.API_URL);
  }

  getStudentById(id: number): Observable<IStudent>{
    return this.http.get<IStudent>(this.API_URL +'/'+ id)
  }  

  deleteStudentById(id: number): Observable<any>{
    return this.http.delete(this.API_URL + '/' + id);
  }

  editStudent(student: IStudent, id: number): Observable<any>{
    return this.http.put(this.API_URL + '/' + id , student);
  }
}
