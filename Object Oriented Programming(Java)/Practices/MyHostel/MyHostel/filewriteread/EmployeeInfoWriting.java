package filewriteread;
import java.io.File;

import java.io.FileWriter;

    

public class EmployeeInfoWriting {
   // Code to create a new file
    
    File EmployeeInfos;

    public void createAFile() {
        try {
            EmployeeInfos = new File("EmployeeInfo.txt");

            if (EmployeeInfos.createNewFile()) {
                System.out.println("\n'EmployeeInfo.txt.txt' is created.\n");
            } else {
                System.out.println("\n'EmployeeInfo.txt' file already exists.\n");
            }
        }
         catch (Exception e) {
            System.out.println(e);
        }
    }


    // Code to write to a file
    public void writeIntoFile(String str) {

        try {
            try (FileWriter file = new FileWriter("EmployeeInfo.txt", true)) {
                file.write(str);
            }
        

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

