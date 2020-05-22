package service.impl;

import models.Services;
import models.Villa;
import service.ServiceInterface;
import validate.Validation;

import java.util.UUID;

public class VillaServiceImpl implements ServiceInterface {
    @Override
    public  Services addNewService() {
        Villa villa = new Villa();
        villa.setServiceCode(Validation.inputAndCheckCodeVilla());
        System.out.println("Enter service name: ");
        villa.setNameService(Validation.inputAndCheckValidationText());
        System.out.println("Enter type rent: ");
        villa.setTypeRent(Validation.inputAndCheckValidationText());
        System.out.println("Enter your enrolled area: ");
        villa.setArea(Validation.inputAndCheckValidationArea());
                villa.setMaxNumberOfPeople(Validation.inputAndCheckValidationMaxNumberOfPeople());
        System.out.println("Enter the rental cost: ");
        villa.setRentalCosts(Validation.inputAndCheckValidationPositiveNumbers());
        villa.setConvenientDescription(Validation.inputAndCheckConvenienceService());
        System.out.println("Enter the area of swimming pool you rented: ");
        villa.setPoolArea(Validation.inputAndCheckValidationArea());
        System.out.println("Enter room standard: ");
        villa.setRoomStandard(Validation.inputAndCheckValidationText());
        System.out.println("Enter number of floors: ");
        villa.setNumberOfFloors(Validation.inputAndCheckValidationPositiveNumbers());
        return villa;
    }
}
