package Lab_11;

import java.io.File;
import java.io.FileWriter;

public class Step04WriteToFile {
    public static void main(String[] args) {
        String filePath = "Lab_11/sample.txt";
        System.out.println("Writing to file: " + filePath);

        // Write to file
        File sampleFile = new File(filePath);
        if (!sampleFile.exists()) {
            System.out.println("File not found: " + filePath);
            return;
        }

        // Write to file
        FileWriter writer = null;
        try {
            writer = new FileWriter(sampleFile, true);
            writer.write("Hello, World!\n");
            writer.write("This is a test.\n");
            writer.write("Goodbye!\n");
        } catch (Exception e) {
            System.out.println("Error writing to file: " + filePath);
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                System.out.println("Error closing file: " + filePath);
            }
        }

    }
}
