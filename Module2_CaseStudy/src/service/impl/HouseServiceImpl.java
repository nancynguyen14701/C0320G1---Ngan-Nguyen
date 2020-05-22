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
        house.setNameService(Validation.inputAndCheckValidationText());
        house.setTypeRent(Validation.inputAndCheckValidationText());
        house.setArea(Validation.inputAndCheckValidationArea());
        house.setMaxNumberOfPeople(Validation.inputAndCheckValidationMaxNumberOfPeople());
        house.setRentalCosts(Validation.inputAndCheckValidationPositiveNumbers());
        house.setConvenientDescription(Validation.inputAndCheckConvenienceService());
        house.setRoomStandard(Validation.inputAndCheckValidationText());
        house.setNumberOfFloors(Validation.inputAndCheckValidationPositiveNumbers());
        return house;
    }
}
