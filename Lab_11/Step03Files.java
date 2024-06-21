package Lab_11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Step03Files {

    public static void main(String[] args) throws IOException {
        String filePath = "Lab_11/sample.txt";
        System.out.println("Reading file: " + filePath);

        File sampleFile = new File(filePath);
        if (!sampleFile.exists()) {
            System.out.println("File not found: " + filePath);
            return;
        }

        FileReader reader = new FileReader(sampleFile);
        try {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + filePath);

        } finally {
            reader.close();
        }

    }

}
