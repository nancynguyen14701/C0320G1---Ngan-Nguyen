package service.impl;

import models.Room;
import models.Services;
import service.ServiceInterface;
import validate.Validation;

public class RoomServiceImpl implements ServiceInterface {
    @Override
    public Services addNewService() {
        Room room = new Room();
        room.setServiceCode(Validation.inputAndCheckCodeRoom());
        room.setNameService(Validation.inputAndCheckValidationText());
        room.setTypeRent(Validation.inputAndCheckValidationText());
        room.setArea(Validation.inputAndCheckValidationArea());
        room.setMaxNumberOfPeople(Validation.inputAndCheckValidationMaxNumberOfPeople());
        room.setRentalCosts(Validation.inputAndCheckValidationPositiveNumbers());
       room.setFreeService(Validation.inputAndCheckValidationText());
        return room;
        
    }
}
