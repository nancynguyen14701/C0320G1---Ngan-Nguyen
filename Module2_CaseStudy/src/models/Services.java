package models;

import service.ServiceInterface;

import java.util.UUID;

public abstract class Services {
    private String id;
    private String serviceCode;
    private String nameService;
    private double area;
    private double rentalCosts;
    private int maxNumberOfPeople;
    private String typeRent;
    public Services() {
    }

    public Services(String id, String serviceCode,String nameService, double area, double rentalCosts, int maxNumberOfPeople, String typeRent) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.nameService = nameService;
        this.area = area;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeRent = typeRent;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getId() {
        return id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }
    public abstract String showInfo();
}
