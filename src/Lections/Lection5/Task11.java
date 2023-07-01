package Lections.Lection5;

import java.io.*;

public class Task11 {
    public static void main(String[] args) {
        byte[] bytesToWrite = {0, 10, 12, 14, 55, 13, 23};
        byte[] bytesToRead = new byte[10];
        File file = new File("DB.txt");

        try (FileOutputStream outFile = new FileOutputStream(file);
             FileInputStream inFile = new FileInputStream(file)) {
            System.out.println("Begin");
            outFile.write(bytesToWrite);
            System.out.println("Bytes written");

            int bytesAvailable = inFile.available();
            System.out.println("Ready to read " + bytesAvailable + " bytes");

            int count = inFile.read(bytesToRead, 0, bytesAvailable);
            for (int i = 0; i < count; i++) {
                System.out.print(" " + bytesToRead[i]);
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.println("Unable to write data to file -- " + file.getName());
        } catch (IOException e) {
            System.out.println("Error input/output: " + e.toString());
        }
    }
}
