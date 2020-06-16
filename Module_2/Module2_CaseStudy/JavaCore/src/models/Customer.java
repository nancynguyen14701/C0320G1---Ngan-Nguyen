package models;

import java.util.UUID;

public class Customer {
    private String id;
    private String nameCustomer;
    private String idCard;
    private String birthday;
    private String gender;
    private String phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;
    private Services service;

    public Customer() {
        this.id = UUID.randomUUID().toString().replace("-", "");
    }

    public Customer(String id, String nameCustomer, String idCard, String birthday, String gender, String phoneNumber, String email, String typeCustomer, String address, Services service) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.service = service;
        this.idCard = idCard;
    }



    public Customer(String id, String nameCustomer, String idCard, String birthday, String gender, String phoneNumber, String email, String typeCustomer, String address) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.idCard = idCard;
    }

    public void setVilla(String nameService, double areaUser, double rentalCosts, int maxPeople, String typeRent) {
        this.service = new Villa();
        this.service.setNameService(nameService);
        this.service.setArea(areaUser);
        this.service.setRentalCosts(rentalCosts);
        this.service.setMaxNumberOfPeople(maxPeople);
        this.service.setTypeRent(typeRent);
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getService() {
        return service;
    }

    public void setService (Services service) {
        this.service = service;
    }

    public int getYearBirthday() {
        String temp = "";
        for (int i = birthday.length() - 4; i < birthday.length(); i++) {
            temp += birthday.charAt(i);
        }
        return new Integer(temp);
    }

    public String showInfo() {
        return "IdCustomer: " + id + "\n" +
                "NameCustomer: " + nameCustomer + "\n" +
                "IdCard: " + idCard + "\n" +
                "Birthday: " + birthday + "\n" +
                "Gender: " + gender + "\n" +
                "PhoneNumber: " + phoneNumber + "\n" +
                "Email: " + email + "\n" +
                "TypeCustomer: " + typeCustomer + "\n" +
                "Address: " + address + "\n";
    }

    @Override
    public String toString() {
       return getId()+ ","+
        getNameCustomer()+ ","+
        getIdCard()+ ","+
        getBirthday()+ ","+
        getGender()+ ","+
        getPhoneNumber()+ ","+
        getEmail()+ ","+
        getTypeCustomer()+ ","+
        getAddress();


    }
    public String bookingToString() {
        return getId()+ ","+
                getNameCustomer()+ ","+
                getIdCard()+ ","+
                getBirthday()+ ","+
                getGender()+ ","+
                getPhoneNumber()+ ","+
                getEmail()+ ","+
                getTypeCustomer()+ ","+
                getAddress()+ ","+
                getService();

    }
}
