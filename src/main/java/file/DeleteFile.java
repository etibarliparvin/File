package file;

import java.io.File;

public class DeleteFile {

    public void delete(String fileName) {
        File myFile = new File(fileName);
        if (myFile.delete()) {
            System.out.println("File has been deleted: " + myFile.getName());
        } else {
            System.out.println("Failed to delete this file.");
        }
    }
}
