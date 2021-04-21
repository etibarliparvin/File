package file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToAFile {

    public void write(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(new Scanner(System.in).nextLine());
            fw.close();
            System.out.println("Successfully wrote to a file.");
        } catch (IOException ex) {
            System.out.println("An error occured.");
            ex.printStackTrace();
        }
    }
}
