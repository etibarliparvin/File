package file;

import java.io.File;

public class MyFile {

    public File createFile(String filePath) {
        File myFile = new File(filePath);
        return myFile;
    }
}
