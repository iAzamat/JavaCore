package Seminars.Seminar4.ru.gb.jcore.Task4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*try {
            int[] numbers = new int[3];
            numbers[3] = 45;
            System.out.println(numbers[3]);
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/

        readTextFile("D://2. Area//Education//project//JavaCore//src//Seminars//Seminar4//ru//gb//jcore//Task4//TestFile.txt");


        //try{}catch{}
        //try{}catch{}finally{}
        //try{}finally{}
    }

    public static void readTextFile(String fileName) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            char[] buf = new char[256];
            int c;
            while ((c = fileReader.read(buf)) > 0) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                for (char symbol : buf) {
                    System.out.print(symbol);
                }
            }
            //fileReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("*** Проблема при открытии файла ***");
        } catch (IOException ex) {
            System.out.println("*** Проблема при работе с файлом ***");
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }


        }

    }
}
