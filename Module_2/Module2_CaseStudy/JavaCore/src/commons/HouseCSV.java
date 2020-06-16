package commons;

import models.House;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HouseCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_HOUSE = "id, serviceCode, nameService, typeRent, area, maxNumberOfPeople,  rentalCosts, convenientDescription, roomStandard,numberOfFloors";
    private static final String PATH_FILE_HOUSE = "src/data/House.csv";
    // Hàm lấy nameService
    public static Set<String> getNameServiceHouse(String path){

        String line = "";
        Set<String> setNameHouse = new TreeSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] arrHouse = line.split(",");
                setNameHouse.add(arrHouse[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return setNameHouse;

    }
    //    Hàm ghi file CSV

    public static void writeFileHouseCSV(List<House> listHouse) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE_HOUSE, true);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house : listHouse) {
                fileWriter.append(house.toString());
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
    public static List<House> readFileHouseCSV() {
        BufferedReader br = null;
        ArrayList<House> houses = new ArrayList<House>();
        Path path = Paths.get(PATH_FILE_HOUSE);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(PATH_FILE_HOUSE);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH_FILE_HOUSE));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                House house = new House();
                house.setServiceCode(splitData[1]);
                house.setNameService(splitData[2]);
                house.setTypeRent(splitData[3]);
                house.setArea(Double.parseDouble(splitData[4]));
                house.setMaxNumberOfPeople(Integer.parseInt(splitData[5]));
                house.setRentalCosts(Double.parseDouble(splitData[6]));
                house.setConvenientDescription(splitData[7]);
                house.setRoomStandard(splitData[8]);
                house.setNumberOfFloors(Double.parseDouble(splitData[9]));
                houses.add(house);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return houses;

    }
}