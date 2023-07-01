package Seminars.Seminar5.ru.gb.jcore.Task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int key = 3;
        long timeStart = System.nanoTime();
        try {
            long timeStart1 = System.nanoTime();
            MyFileHandler.encryptFile("DB.txt", "testEncrypt.txt", key);
            double deltaTime1 = (System.nanoTime() - timeStart1) * 0.000000001;
            System.out.println("Шифрование заняло (сек): " + deltaTime1);

            long timeStart2 = System.nanoTime();
            MyFileHandler.decryptFile("testEncrypt.txt", "testDecrypt.txt", key);
            double deltaTime2 = (System.nanoTime() - timeStart2) * 0.000000001;
            System.out.println("Дешифрование заняло (сек): " + deltaTime2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        double deltaTime = (System.nanoTime() - timeStart) * 0.000000001;
        System.out.println("Всего потрачено времени (сек): " + deltaTime);
    }


}
