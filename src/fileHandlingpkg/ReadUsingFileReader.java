package fileHandlingpkg;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingFileReader {

    public static void main(String[] args) {
        // Dynamically resolve path to Downloads/newfile.txt
    	String basePath = System.getProperty("user.dir") + File.separator;
        String filePath = basePath +"src" + File.separator + "fileHandlingpkg" + File.separator +"newfile.txt";
        File file = new File(filePath);

        if (!file.exists()) {
            System.err.println("File not found: " + filePath);
            return;
        }

        System.out.println("Reading file using FileReader:");
        try (FileReader reader = new FileReader(file)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}