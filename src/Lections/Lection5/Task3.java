package Lections.Lection5;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task3 {
    public static void main(String[] args) {
        // Путь
        File file = new File("Main.java");
        Path filePath = Paths.get(file.getName());
        System.out.println(filePath);
    }
}
