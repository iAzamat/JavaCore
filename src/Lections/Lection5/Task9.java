package Lections.Lection5;

import java.io.*;

public class Task9 {
    public static void main(String[] args) {
        byte[] bytesToWrite = {0, 10, 12, 14, 55, 13, 23};
        byte[] bytesToRead = new byte[10];
        File file = new File("DB.txt");

        try {
            System.out.println("Begin");
            FileOutputStream outFile = new FileOutputStream(file);
            outFile.write(bytesToWrite);
            outFile.close();
            System.out.println("Bytes written");

            FileInputStream inFile = new FileInputStream(file);
            int bytesAvailable = inFile.available();
            System.out.println("Ready to read " + bytesAvailable + " bytes");

            int count = inFile.read(bytesToRead, 0, bytesAvailable);
            for (int i = 0; i < count; i++) {
                System.out.print(" " + bytesToRead[i]);
            }
            System.out.println();
            inFile.close();
            System.out.println("Input stream closed");
        } catch (FileNotFoundException e) {
            System.out.println("Unable to write data to file -- " + file.getName());
        } catch (IOException e) {
            System.out.println("Error input/output: " + e.toString());
        }
    }
}
