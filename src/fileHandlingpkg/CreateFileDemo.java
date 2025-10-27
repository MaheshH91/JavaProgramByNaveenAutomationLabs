package fileHandlingpkg;


import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

    public static void main(String[] args) {
        // Dynamic path to user's Downloads folder
    	String basePath = System.getProperty("user.dir") + File.separator;
        String filePath = basePath +"src" + File.separator + "fileHandlingpkg" + File.separator + "newfile.txt";
        File file = new File(filePath);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }
}