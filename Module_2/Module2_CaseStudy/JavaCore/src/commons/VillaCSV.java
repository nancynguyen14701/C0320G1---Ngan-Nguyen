package commons;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import models.House;
import models.Room;
import models.Villa;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class VillaCSV {

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_VILLA = "id, serviceCode, nameService, typeRent, area, rentalCosts, maxNumberOfPeople, roomStandard, convenientDescription, poolArea, numberOfFloors";
    private static final String PATH_FILE_VILLA = "src/data/Villa.csv";
    // Hàm lấy nameService
    public static Set<String> getNameServiceVilla(String path){

        String line = "";
        Set<String> setNameVilla = new TreeSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] arrVilla = line.split(",");
                setNameVilla.add(arrVilla[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return setNameVilla;

    }

//    Hàm ghi file CSV

    public static void writeFileVillaCSV(List<Villa> listVilla) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE_VILLA,true);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa : listVilla) {
                fileWriter.append(villa.toString());
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
    public static List<Villa> readFileVillaCSV() {
        BufferedReader br = null;
        ArrayList<Villa> villas = new ArrayList<Villa>();
        Path path= Paths.get(PATH_FILE_VILLA);
        if(!Files.exists(path)){
            try{
                Writer writer= new FileWriter(PATH_FILE_VILLA);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH_FILE_VILLA));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setServiceCode(splitData[1]);
                villa.setNameService(splitData[2]);
                villa.setTypeRent(splitData[3]);
                villa.setArea(Double.parseDouble(splitData[4]));
                villa.setMaxNumberOfPeople(Integer.parseInt(splitData[5]));
                villa.setRentalCosts(Double.parseDouble(splitData[6]));
                villa.setConvenientDescription(splitData[7]);
                villa.setPoolArea(Double.parseDouble(splitData[8]));
                villa.setRoomStandard(splitData[9]);
                villa.setNumberOfFloors(Double.parseDouble(splitData[10]));
                villas.add(villa);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return villas;

    }


}

