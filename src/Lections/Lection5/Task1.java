package Lections.Lection5;

import java.io.File;

public class Task1 {
    public static void main(String[] args) {
        // Класс файл
//       File file = new File("file.txt");

        // Директории
//        File folder = new File(".");
//        for (File file : folder.listFiles()) {
//            System.out.println(file.getName());
//        }

        // Получение информации
        File folder = new File(".");
        System.out.println("Is it a folder -- " + folder.isDirectory());
        System.out.println("Is it a file -- " + folder.isFile());
        File file = new File("./Test.txt");
        System.out.println("Length file -- " + file.length());
        System.out.println("Absolute path -- " + file.getAbsolutePath());
        System.out.println("Total space on disk -- " + file.getTotalSpace());
        System.out.println("File deleted -- " + file.delete());
        System.out.println("File exists -- " + file.exists());
        System.out.println("Free space on disk -- " + file.getFreeSpace());

    }
}
