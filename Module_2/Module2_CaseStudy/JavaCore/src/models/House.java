package models;

public class House extends Services {
    private String roomStandard;
    private String convenientDescription;
    private double numberOfFloors;
    public House() {
    }

    public House(String id, String serviceCode, String nameService, double area, double rentalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, int numberOfFloors) {
        super(id, serviceCode, nameService, area, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
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

    public double getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(double numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfo() {
        return "House: " + super.getServiceCode()+'\n' +
                "Id: " + super.getId() + '\n' +
                "Name Service: " + super.getNameService() + '\n' +
                "Area​​ Use: " + super.getArea() + '\n' +
                "Rental Costs: " + super.getRentalCosts() + '\n' +
                "Max Number Of People: " + super.getMaxNumberOfPeople() + '\n' +
                "Type Rent: " + super.getTypeRent()+ '\n' +
                "Room Standard: " + roomStandard + '\n' +
                "Convenient Description:  " + convenientDescription + '\n' +
                "Number Of Floors: " + numberOfFloors;
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
                this.getRoomStandard()+ ","+
                this.getNumberOfFloors();
}
}
