package Lections.Lection5;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Task5 {
    public static void main(String[] args) {
        // Очистка путей
        Path filePath = Paths.get("pics/logo.png");
        System.out.println(filePath.isAbsolute());
        Path pathFirst = Paths.get("./pics/logo.png");
        System.out.println(pathFirst.normalize());

        Path pathSecond = Paths.get("./sources-draft/../pics/logo.png");
        System.out.println(pathSecond.normalize());
    }
}
