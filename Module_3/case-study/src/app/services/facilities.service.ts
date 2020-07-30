import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IFacility } from '../interface/IFacility';

@Injectable({
  providedIn: 'root'
})
export class FacilitiesService {

  private readonly API_URL = "http://localhost:3000/facilities"

  constructor(private http: HttpClient) { }

  getAllFacilities():Observable<IFacility[]>{
    return this.http.get<IFacility[]>(this.API_URL);
  }

  getFacilitiesById(id: number): Observable<IFacility>{
    return this.http.get<IFacility>(this.API_URL + '/' + id);
  }

  addNewFacility(facility: IFacility): Observable<any>{
    return this.http.post(this.API_URL, facility);
  }

  editFacility(facility: IFacility, id: number): Observable<any>{
    return this.http.put(this.API_URL + '/' + id, facility);
  }

  deleteFacility(id: number): Observable<any>{
    return this.http.delete(this.API_URL + '/' + id);
  }
}
