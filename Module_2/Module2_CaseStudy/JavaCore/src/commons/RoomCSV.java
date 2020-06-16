package commons;

import models.Room;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RoomCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_ROOM = "id, nameService, typeRent,area, rentalCosts, maxNumberOfPeople,  freeService";
    private static final String PATH_FILE_ROOM = "src/data/Room.csv";
    // Hàm lấy nameService
    public static Set<String> getNameServiceRoom(String path){

        String line = "";
        Set<String> setNameRoom = new TreeSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] arrRoom = line.split(",");
                setNameRoom.add(arrRoom[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return setNameRoom;
    }
    //    Hàm ghi file CSV
    public static void writeFileRoomCSV(List<Room> listRoom) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE_ROOM,true);
            fileWriter.append(FILE_HEADER_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room : listRoom) {
                fileWriter.append(room.toString());
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
    public static List<Room> readFileRoomCSV() {
        BufferedReader br = null;
        ArrayList<Room> rooms = new ArrayList<Room>();
        Path path= Paths.get(PATH_FILE_ROOM);
        if(!Files.exists(path)){
            try{
                Writer writer= new FileWriter(PATH_FILE_ROOM);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH_FILE_ROOM));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Room room = new Room();
                room.setServiceCode(splitData[1]);
                room.setNameService(splitData[2]);
                room.setTypeRent(splitData[3]);
                room.setArea(Double.parseDouble(splitData[4]));
                room.setMaxNumberOfPeople(Integer.parseInt(splitData[5]));
                room.setRentalCosts(Double.parseDouble(splitData[6]));
                room.setFreeService(splitData[7]);
                rooms.add(room);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rooms;

    }

}
