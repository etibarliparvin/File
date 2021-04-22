package file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

public class NIO {
    public void createFile(String fileName) throws Exception {
        Path p = Paths.get(fileName);
        Path path = Files.createFile(p);
    }

    public void readFromFile(String fileName) throws Exception {
        Path p = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(p);
        System.out.println(new String(bytes));
    }

    public void writeToFile(String fileName) throws Exception {
        Path p = Paths.get(fileName);
        String content = new Scanner(System.in).nextLine();
        Files.write(p, content.getBytes());
    }

    public void copyFile(String sourceFile, String destinationFile) throws Exception {
        System.out.println("Started: " + new Date());
        Path source = Paths.get(sourceFile);
        Path destination = Paths.get(destinationFile);
        Files.copy(source, destination);
        System.out.println("Completed: " + new Date());
    }

    public void moveFile(String sourceFile, String destinationFile) throws Exception {
        System.out.println("Started: " + new Date());
        Path source = Paths.get(sourceFile);
        Path destination = Paths.get(destinationFile);
        Files.move(source, destination);
        System.out.println("Completed: " + new Date());
    }

    public void writeAllTypeOfFiles(String fileItself, String destinationPlace) throws Exception {
        Path file = Paths.get(fileItself);
        Path destination = Paths.get(destinationPlace);
        byte[] bytes = Files.readAllBytes(file);
        Files.write(destination, bytes);
    }

    public void readAllTypeOfFiles(String filePath) throws Exception {
        Path path = Paths.get(filePath);
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
    }
}
