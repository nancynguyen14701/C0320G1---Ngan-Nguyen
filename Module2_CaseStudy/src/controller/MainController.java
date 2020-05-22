package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import commons.FuncFileCSV;
import models.Services;
import models.Villa;
import service.ServiceInterface;
import service.impl.HouseServiceImpl;
import service.impl.RoomServiceImpl;
import service.impl.VillaServiceImpl;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    private ServiceInterface villaService = new VillaServiceImpl();
    private ServiceInterface houseService = new HouseServiceImpl();
    private ServiceInterface roomService = new RoomServiceImpl();

    public void displayMainMenu() {
        System.out.println(
                "1. Add New Services\n" +
                        "2. Show Services\n" +
                        "3. Add New Customers\n" +
                        "4. Show Information Customer\n" +
                        "5. Add New Booking Resort\n" +
                        "6. Show Information Employee\n" +
                        "7. Add booking cinema 4D\n" +
                        "8. Show booking cinema 4D\n" +
                        "9. Search Filing Cabinets of Employee\n" +
                        "10. Exit");
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1": {
                menuAddNewService();
                break;
            }
//            case 2: {
//                menuShowService();
//                break;
//            }
//            case 3: {
//                addNewCustomer();
//                break;
//            }
//            case 4: {
//                showInfoCustomer();
//                break;
//            }
//            case 5: {
//                addNewBooking();
//                break;
//            }
//            case 6: {
//                showInformationEmployee();
//                break;
//            }
//            case 7: {
//                addBookingCinema();
//                break;
//            }
//            case 8: {
//                showBookingCinema();
//                break;
//            }
//            case 9: {
//                searchFilingCabinetsOfEmployee();
//                break;
//            }
//            case 10: {
//                System.exit(0);
//            }
            default: {
                System.out.println("Failed! UNVALIDATED FORMAT...Enter to continue!");
                scanner.nextLine();
                displayMainMenu();
            }
        }
    }

    private void menuAddNewService() {
        scanner = new Scanner(System.in);
        int choice;
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" +
                "5. Exit");
        System.out.print("Input your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                addListVillaService();
                break;
            }
            case 2: {
                addListHouseService();
                break;
            }
            case 3: {
                addListRoomService();
                break;
            }

            case 4: {
                displayMainMenu();
                break;
            }
            default: {
                System.exit(0);
            }
        }

    }

    public void addListVillaService() {
        scanner = new Scanner(System.in);
        System.out.println("How many villas do you want to hire?");
        int number = scanner.nextInt();
        for(int i=0;i<number;i++){
            villaService.addNewService();
            FuncFileCSV.writeFileCSV(villaService.addNewService());
        }
    }
    public void addListHouseService(){
        scanner = new Scanner(System.in);
        System.out.println("How many houses do you want to hire?");
        int number = scanner.nextInt();
        for(int i=0;i<number;i++){
            houseService.addNewService();
            FuncFileCSV.writeFileCSV(houseService.addNewService());
        }
    }
    public void addListRoomService(){
        scanner = new Scanner(System.in);
        System.out.println("How many rooms do you want to hire?");
        int number = scanner.nextInt();
        for(int i=0;i<number;i++){
            roomService.addNewService();
            FuncFileCSV.writeFileCSV(roomService.addNewService());
        }
    }
}

