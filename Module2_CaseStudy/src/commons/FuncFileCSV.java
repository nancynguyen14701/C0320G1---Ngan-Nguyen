package commons;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import models.House;
import models.Room;
import models.Villa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FuncFileCSV {

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_VILLA = "id, nameService, area, rentalCosts, maxNumberOfPeople, typeRent, roomStandard, convenientDescription, poolArea, numberOfFloors";
    private static final String FILE_HEADER_HOUSE = "id, nameService, area, rentalCosts, maxNumberOfPeople, typeRent, roomStandard,convenientDescription, numberOfFloors";
    private static final String FILE_HEADER_ROOM = "id, nameService, area, rentalCosts, maxNumberOfPeople, typeRent, freeService";

    private static final String PATH_FILE_VILLA = "src/data/Villa.csv";
    private static final String PATH_FILE_HOUSE = "src/data/House.csv";
    private static final String PATH_FILE_ROOM = "src/data/Room.csv";
    static String path;
    static String header;
//    Hàm ghi file CSV

    public static <T> void writeFileCSV(T data) {

        if (data instanceof Villa) {
            path = PATH_FILE_VILLA;

        }
        if (data instanceof House) {
            path = PATH_FILE_HOUSE;

        }
        if (data instanceof Room) {
            path = PATH_FILE_ROOM;

        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, true);
            fileWriter.append(header);
            fileWriter.append(NEW_LINE_SEPARATOR);
            fileWriter.append(data.toString());

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
    public static <T> void readFileCSV(T data){
        if (data instanceof Villa) {
            path = PATH_FILE_VILLA;
            header = FILE_HEADER_VILLA;
        }
        if (data instanceof House) {
            path = PATH_FILE_HOUSE;
            header = FILE_HEADER_HOUSE;
        }
        if (data instanceof Room) {
            path = PATH_FILE_ROOM;
            header = FILE_HEADER_ROOM;
        }
        try {
            CSVReader reader= new CSVReader(new FileReader(path));
            String[] nextLine;
            while((nextLine=reader.readNext())!= null){
                if (nextLine != null){
                    System.out.println(Arrays.toString(nextLine));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Read successfully");
    }


}

