package Lections.Lection5;

import java.io.*;

public class Task10 {
    public static void main(String[] args) throws IOException {
        byte[] bytesToWrite = {0, 10, 12, 14, 55, 13, 23};
        byte[] bytesToRead = new byte[10];
        File file = new File("DB.txt");

        FileOutputStream outFile = null;
        FileInputStream inFile = null;

        try {
            System.out.println("Begin");
            outFile = new FileOutputStream(file);
            outFile.write(bytesToWrite);
            System.out.println("Bytes written");

            inFile = new FileInputStream(file);
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
        } finally {
            if (outFile != null) {
                outFile.close();
                System.out.println("Output stream closed");
            }
            if (inFile != null) {
                inFile.close();
                System.out.println("Input stream closed");
            }
        }
    }
}
