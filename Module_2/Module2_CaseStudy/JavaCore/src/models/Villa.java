package models;

import service.ServiceInterface;
import validate.Validation;

public class Villa extends Services  {
    private String roomStandard;
    private String convenientDescription;
    private double poolArea;
    private double numberOfFloors;

    public Villa() {
    }

    public Villa(String id,String serviceCode,String nameService, double area, double rentalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, double poolArea, int numberOfFloors) {
        super(id,serviceCode, nameService, area, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public double getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(double numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfo() {
        return "Villa: " + super.getServiceCode() + '\n' +
                "Id: " + super.getId() + '\n' +
                "Name Service: " + super.getNameService() + '\n' +
                "Area​​ Use: " + super.getArea() + '\n' +
                "Rental Costs: " + super.getRentalCosts() + '\n' +
                "Max Number Of People: " + super.getMaxNumberOfPeople() + '\n' +
                "Type Rent: " + super.getTypeRent()+ '\n' +
                "Room Standard: " + this.getRoomStandard()+ '\n' +
                "Convenient Description: " + this.getConvenientDescription() + '\n' +
                "Area Pool: " + this.getPoolArea() + '\n' +
                "Number Of Floors: " + this.getNumberOfFloors();
    }

    @Override
    public String toString() {
        return super.getId()+ ","+
                super.getServiceCode()+ ","+
                super.getNameService()+ ","+
                super.getTypeRent()+ ","+
                super.getArea()+ ","+
                super.getMaxNumberOfPeople()+ ","+
                super.getRentalCosts()+ ","+
                this.getConvenientDescription()+ ","+
                this.getPoolArea()+ ","+
                this.getRoomStandard()+ ","+
                this.getNumberOfFloors();
    }



    }

