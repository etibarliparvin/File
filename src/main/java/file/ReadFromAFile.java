package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromAFile {

    public void read(String fileName) {
        try {
            File myFile = new File(fileName);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNext()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException ex){
            System.out.println("An error occured");
            ex.printStackTrace();
        }
    }
}
