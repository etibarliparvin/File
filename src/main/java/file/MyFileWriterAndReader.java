package file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MyFileWriterAndReader {

    public static void writeToFileV1(String text, String fileName) {
        try (FileWriter fw = new FileWriter(fileName);
             BufferedWriter bw = new BufferedWriter(fw)) { // try-with-resources
            bw.write(text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void writeToFileV2(String text, String fileName) throws IOException {
        Files.write(Paths.get(fileName), text.getBytes(), StandardOpenOption.WRITE);
    }

    public static String readFromFile(String fileName) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null){
                content.append(line);
                }
            return content.toString();
        }
    }

    public static void writeObjectToFile(Object object, String fileName) {
        try (FileOutputStream f = new FileOutputStream(fileName);
             ObjectOutputStream o = new ObjectOutputStream(f)) {
            o.writeObject(object);
        } catch (Exception ex) {
            System.out.println("File not found");
        }
    }

    public static void writeObjectToConsole(Object object) {
        try (ObjectOutputStream o = new ObjectOutputStream(System.out)) {
            o.writeObject(object);
        } catch (Exception ex) {
            System.out.println("File not found");
        }
    }

    public static Object readObjectFromFile(String fileName) {
        try (FileInputStream fi = new FileInputStream(fileName);
             ObjectInputStream oi = new ObjectInputStream(fi)) {
            return oi.readObject();
        } catch (Exception ex) {
            System.out.println("File not found");
            return null;
        }
    }
}
