package commons;

import models.Customer;
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

public class CustomerCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String PATH_FILE_CUSTOMER = "src/data/customer.csv";
    private static final String FILE_HEADER_CUSTOMER = "id, nameCustomer, idCard, birthday, gender, phoneNumber, email, typeCustomer, address";
    public static final String DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeFileCustomerCSV(List<Customer> listCustomer) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE_CUSTOMER, true);
            fileWriter.append(FILE_HEADER_CUSTOMER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer : listCustomer) {
                fileWriter.append(customer.toString());
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
    // Hàm đọc file CSV
    public static List<Customer> readFileCustomerCSV() {
        BufferedReader br = null;
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Path path = Paths.get(PATH_FILE_CUSTOMER);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(PATH_FILE_CUSTOMER);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH_FILE_CUSTOMER));
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
