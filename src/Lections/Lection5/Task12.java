package Lections.Lection5;

import java.io.*;

public class Task12 {
    public static void main(String[] args) {
        // Запишем
        File filename = new File("DB.txt");
        try (BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream(filename))) {
            long timeStart = System.currentTimeMillis();
            for (int i = 1_000_000; --i >= 0; ) {
                outStream.write(i);
            }

            long time = System.currentTimeMillis() - timeStart;
            System.out.println("Writing time: " + time + " millisec");
        } catch (IOException e) {
            System.out.println("IOException: " + e.toString());
            e.printStackTrace();
        }


        // Считаем напрямую
        try (InputStream inStream = new FileInputStream(filename);) {
            long timeStart = System.currentTimeMillis();

            while (inStream.read() != -1) {
            }

            long time = System.currentTimeMillis() - timeStart;
            System.out.println("Direct read time: " + (time) + " millisec");
        } catch (IOException e) {
            System.out.println("IOException: " + e.toString());
            e.printStackTrace();
        }

        // Считаем с буффером
        try (BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(filename))) {
            long timeStart = System.currentTimeMillis();

            while (inStream.read() != -1) {
            }

            long time = System.currentTimeMillis() - timeStart;
            System.out.println("Buffered read time: " + (time) + " millisec");
        } catch (IOException e) {
            System.out.println("IOException: " + e.toString());
            e.printStackTrace();
        }

    }
}
