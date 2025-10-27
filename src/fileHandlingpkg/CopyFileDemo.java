package fileHandlingpkg;

import java.io.*;
import java.nio.file.*;

public class CopyFileDemo {

    // Utility method to validate source file existence
    public static boolean validateSourceFile(String sourcePath) {
        File file = new File(sourcePath);
        if (!file.exists()) {
            System.err.println("Source file not found: " + sourcePath);
            return false;
        }
        System.out.println("Source file found: " + sourcePath);
        return true;
    }

    // Method 1: Using FileInputStream and FileOutputStream with configurable buffer
    public static void copyUsingStreams(String sourcePath, String destPath, int bufferSize) throws IOException {
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            byte[] buffer = new byte[bufferSize];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println(" File copied using streams to: " + destPath);
        }
    }

    // Method 2: Using Java NIO Files.copy
    public static void copyUsingNIO(String sourcePath, String destPath) throws IOException {
        Path source = Paths.get(sourcePath);
        Path destination = Paths.get(destPath);
        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied using NIO to: " + destPath);
    }

    public static void main(String[] args) {
        String basePath = System.getProperty("user.dir") + File.separator;
        System.out.println("Working directory: " + basePath);

        String source = basePath + "src" + File.separator + "fileHandlingpkg" + File.separator + "source.txt";
        String destinationStream = basePath + "src" + File.separator + "fileHandlingpkg" + File.separator + "destination.txt";
        String destinationNIO = basePath + "src" + File.separator + "fileHandlingpkg" + File.separator + "destination_nio.txt";

        if (validateSourceFile(source)) {
            try {
                copyUsingStreams(source, destinationStream, 1024);
                copyUsingNIO(source, destinationNIO);
            } catch (IOException e) {
                System.err.println("Error during file copy: " + e.getMessage());
            }
        } else {
            System.err.println("Aborting copy operation due to missing source file.");
        }
    }
}