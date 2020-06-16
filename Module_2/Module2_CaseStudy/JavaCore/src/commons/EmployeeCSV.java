package commons;

import models.Customer;
import models.Employee;
import models.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String PATH_FILE_EMPLOYEE = "src/data/customer.csv";
    private static final String FILE_HEADER_EMPLOYEE = "id, nameEmployee, age, address";
    public static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeFileEmployeeCSV(List<Employee> listEmployee) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE_EMPLOYEE, true);
            fileWriter.append(FILE_HEADER_EMPLOYEE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Employee employee : listEmployee) {
                fileWriter.append(employee.toString());
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
    public static List<Employee> readFileEmployeeCSV() {
        BufferedReader br = null;
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Path path = Paths.get(PATH_FILE_EMPLOYEE);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(PATH_FILE_EMPLOYEE);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH_FILE_EMPLOYEE));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setIdEmployee(splitData[1]);
                employee.setNameEmployee(splitData[2]);
                employee.setAge(Integer.parseInt(splitData[3]));
                employee.setAddress(splitData[4]);

                employees.add(employee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;

    }
}
