package commons;

import models.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookingCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String PATH_FILE_BOOKING = "src/data/booking.csv";
    private static final String FILE_HEADER_BOOKING = "id, nameCustomer, idCard, birthday, gender, phoneNumber, email, typeCustomer, address, serviceId, serviceCode, nameService,area, rentalCosts, maxNumberOfPeople, typeRent";
    public static final String DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";
    public static void writeFileBookingCSV(List<Customer> listCustomer) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE_BOOKING, true);
            fileWriter.append(FILE_HEADER_BOOKING);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer : listCustomer) {
                fileWriter.append(customer.bookingToString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        } catch (Exception ex) {
            System.out.println("Error in csvFileWriter!!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
        System.out.println("File written successfully");
    }
    public static List<Customer> readFileBookingCSV() {
        BufferedReader br = null;
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Path path = Paths.get(PATH_FILE_BOOKING);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(PATH_FILE_BOOKING);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH_FILE_BOOKING));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setNameCustomer(splitData[1]);
                customer.setIdCard(splitData[2]);
                customer.setBirthday(splitData[3]);
                customer.setGender(splitData[4]);
                customer.setPhoneNumber(splitData[5]);
                customer.setEmail(splitData[6]);
                customer.setAddress(splitData[7]);
                customers.add(customer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;

    }
}
