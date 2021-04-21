package file;

import java.io.File;
import java.io.IOException;

public class CreateFiles {

    public File create(String fileName) {
        try {
            File myFile = new File(fileName);
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File is already exists.");
            }
            return myFile;
        } catch (IOException ex) {
            System.out.println("An error occured.");
            ex.printStackTrace();
            return null;
        }
    }
}
