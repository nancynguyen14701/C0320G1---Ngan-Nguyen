import { IFacility } from './IFacility';
import { ICustomer } from './ICustomer';
import { IEmployee } from './IEmployee';
export interface IContract{
    id: string;   
    startDate: string;   
    endDate: string;
    customer: string;
    employee:string;
    deposit: number;
    total: number;


}