package service.impl;


import models.House;
import models.Services;
import service.ServiceInterface;
import validate.Validation;

public class HouseServiceImpl implements ServiceInterface {

    @Override
    public Services addNewService() {
       House house = new House();
        house.setServiceCode(Validation.inputAndCheckCodeHouse());
        System.out.println("Enter service name: ");
        house.setNameService(Validation.inputAndCheckValidationText());
        System.out.println("Enter type rent: ");
        house.setTypeRent(Validation.inputAndCheckValidationText());
        house.setArea(Validation.inputAndCheckValidationArea());
        house.setMaxNumberOfPeople(Validation.inputAndCheckValidationMaxNumberOfPeople());
        System.out.println("Enter the rental cost: ");
        house.setRentalCosts(Validation.inputAndCheckValidationPositiveNumbers());
        house.setConvenientDescription(Validation.inputAndCheckConvenienceService());
        System.out.println("Enter room standard: ");
        house.setRoomStandard(Validation.inputAndCheckValidationText());
        System.out.println("Enter number of floors: ");
        house.setNumberOfFloors(Validation.inputAndCheckValidationPositiveNumbers());
        return house;
    }
}
