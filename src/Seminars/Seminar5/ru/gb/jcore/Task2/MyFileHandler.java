package Seminars.Seminar5.ru.gb.jcore.Task2;

import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class MyFileHandler {

    public static void encryptFile(String fileIn, String fileOut, int key) throws IOException {
        String line;
        clearFile(fileOut);
        try (BufferedReader reader = new BufferedReader(new FileReader(fileIn))) {
            line = reader.readLine();
            while (line != null) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut, true))) {
                    writer.write(Cypher.encrypt(line, key));
                    line = reader.readLine();
                    if (line != null) {
                        writer.newLine();
                    }
                }
            }
            System.out.printf("Файл %s был зашифрован в файл %s\n", fileIn, fileOut);
        }
    }

    public static void decryptFile(String fileIn, String fileOut, int key) throws IOException {
        String line;
        clearFile(fileOut);
        try (BufferedReader reader = new BufferedReader(new FileReader(fileIn))) {
            line = reader.readLine();
            while (line != null) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut, true))) {
                    writer.write(Cypher.dencrypt(line, key));
                    line = reader.readLine();
                    if (line != null) {
                        writer.newLine();
                    }
                }
            }
            System.out.printf("Файл %s был дешифрован в файл %s\n", fileIn, fileOut);
        }
    }

    public static void clearFile(String fileName) {
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            raf.setLength(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
