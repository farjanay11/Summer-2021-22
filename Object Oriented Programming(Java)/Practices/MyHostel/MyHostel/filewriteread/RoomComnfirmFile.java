package filewriteread;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class RoomComnfirmFile {
    File createFileObject;

    public void createAFile() {
        try {
            createFileObject = new File("RoomComnfirmFile.txt");

            if (createFileObject.createNewFile()) {
               // System.out.println("\n'RoomComnfirmFile.txt' is created.\n");
            } else {
                System.out.println("\n'RoomComnfirmFile.txt' file already exists.\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void writeIntoFile(String str) {

        try {
            FileWriter writeIntoFileObject = new FileWriter("RoomComnfirmFile.txt", true);
            writeIntoFileObject.write(str);

            writeIntoFileObject.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void readFromFile() {

        try {
            Scanner readFromFileObject = new Scanner(createFileObject);

            while (readFromFileObject.hasNextLine()) {
                String orderData = readFromFileObject.nextLine();
                System.out.println(orderData);
            }
            readFromFileObject.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        createFileObject.delete();
    }
}
