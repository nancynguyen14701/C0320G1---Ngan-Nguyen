package validate;

import java.time.LocalDate;
import java.util.Scanner;

public class Validation {
    private static String regex = "";
    private static Scanner scanner;

    public static String inputAndCheckCodeVilla() {
        regex = "^(SV)(VL)-[0-9]{4}$";
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("Enter your Villa code : ");
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            } else {
                System.out.println("FAILED!! INVALID FORMAT...");
            }
        }
    }

    public static String inputAndCheckCodeHouse() {
        regex = "^(SV)(HO)-[0-9]{4}$";
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("Enter House Code : ");
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            } else {
                System.out.println("FAILED!! INVALID FORMAT...");
            }
        }
    }

    public static String inputAndCheckCodeRoom() {
        regex = "^(SV)(RO)-[0-9]{4}$";
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("Enter Room Code : ");
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            } else {
                System.out.println("FAILED!! INVALID FORMAT...");
            }
        }
    }

    public static String inputAndCheckValidationText() {
        regex = "^[A-Z](\\s)?[a-z]+$";
        while (true) {
            scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            } else {
                System.out.println("FAILED!! INVALID FORMAT...");
            }
        }
    }

//    public static String inputAndCheckValidationTypeRentOrRoomStandard() {
//
//        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
//        while (true) {
//            scanner = new Scanner(System.in);
//            System.out.println("Enter your room standard: ");
//            String typeRentOrRoomStandard = scanner.nextLine();
//            if (typeRentOrRoomStandard.matches(regex)) {
//                return typeRentOrRoomStandard;
//            } else {
//                System.out.println("FAILED!! INVALID FORMAT...");
//            }
//        }
//    }

    public static Double inputAndCheckValidationArea() {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                double area = scanner.nextDouble();
                if (area > 30) {
                    return area;
                } else {
                    System.out.println("This measurement needs to be bigger than 30");
                    System.out.print("Enter again: ");
                }
            } catch (Exception e) {
                System.out.println("FAILED!! INVALID FORMAT...");
                System.out.print("Please enter to continue!! ");
                scanner.nextLine();
            }
        }
    }

    public static Double inputAndCheckValidationPositiveNumbers() {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                double rentalCosts = scanner.nextDouble();
                if (rentalCosts > 0) {
                    return rentalCosts;
                } else {
                    System.out.println("This measurement needs to be positive number");
                }
            } catch (Exception e) {
                System.out.println("FAILED!! INVALID FORMAT...");
                System.out.print("Please enter to continue!! ");
                scanner.nextLine();
            }
        }
    }

    public static Integer inputAndCheckValidationMaxNumberOfPeople() {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Enter the maximum number of customer: ");
                int maxNumberOfPeople = scanner.nextInt();
                if (maxNumberOfPeople > 0 && maxNumberOfPeople < 20) {
                    return maxNumberOfPeople;
                } else {
                    System.out.println("This information  needs to be bigger than 0 and lower than 20!!");
                }
            } catch (Exception e) {
                System.out.println("FAILED!! INVALID FORMAT...");
                System.out.print("Please enter to continue!! ");
                scanner.nextLine();
            }
        }
    }


    public static String inputAndCheckConvenienceService() {
        String[] convenienceServices = {"massage", "karaoke", "food", "drink", "car"};
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.println("Our resort offers these following services: " + "\n" +
                        "massage, karaoke, food, drink, car");
                System.out.println("How many services do you want to experience? Let us know the number first!!!");
                int numbers = scanner.nextInt();
                int count = 0;
                String services;
                StringBuilder stringBuilder = new StringBuilder();
                System.out.println("Please enter type of convenience services you want to try: ");
                for (int i = 0; i < numbers; i++) {
                    String service = scanner.nextLine();
                    for (String convenienceService : convenienceServices) {
                        if (convenienceService.equals(service)) {
                            count++;
                            stringBuilder.append(convenienceService);
                            stringBuilder.append(",");
                            System.out.println("Let's write the rest or enter if you're done!");
                        }
                    }
                }
                services = stringBuilder.toString();
                    if (count > 0 && count < 6) {
                        System.out.println("Wish you an enjoyable vacation");
                        return services;
                    }

                }catch (Exception e) {
                System.out.println("FAILED!! INVALID FORMAT...");
                System.out.print("Please enter to continue!! ");
                scanner.nextLine();
            }
            }
        }

    public static String inputAndCheckValidationBirthday() {
        regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("Enter your birthday (format dd/MM/yyyy): ");
            String birthday = scanner.nextLine();
            LocalDate date = LocalDate.now();

            if (birthday.matches(regex)) {
                String temp = "";
                for (int i = birthday.length() - 4; i < birthday.length(); i++) {
                    temp += birthday.charAt(i);
                }
                if (date.getYear() - new Integer(temp) >= 18) {
                    return birthday;
                } else {
                    System.out.println("You have to be at least 18 years old to enroll");
                }

            } else {
                System.out.println("FAILED!! INVALID FORMAT...");
                System.out.print("Please enter to continue!! ");
                scanner.nextLine();
            }
        }
    }

}
