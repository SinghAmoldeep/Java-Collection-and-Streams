
package Streams.BufferedStreams;

import java.io.*;
public class FileHandler {

    public static void copyFileBuffered(String inputFilePath, String outputFilePath) {
        long startTime = System.nanoTime(); // Start time measurement
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFilePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFilePath))) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            bos.flush(); // Ensure all data is written
            long endTime = System.nanoTime(); // End time measurement
            System.out.println("Buffered Copy completed in " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }

    // Copy file using Unbuffered Streams (For Performance Comparison)
    public static void copyFileUnbuffered(String inputFilePath, String outputFilePath) {
        long startTime = System.nanoTime(); // Start time measurement
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            long endTime = System.nanoTime(); // End time measurement
            System.out.println("Unbuffered Copy completed in " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
