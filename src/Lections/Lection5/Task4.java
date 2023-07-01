package Lections.Lection5;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Task4 {
    public static void main(String[] args) {
        // Действия с путями
        Path filePath = Paths.get("pics/logo.png");
        Path fileName = filePath.getFileName();
        System.out.println("Filename: " + fileName);
        Path parent = filePath.getParent();
        System.out.println("Parent directory: " + parent);

        boolean endWithTxt = filePath.endsWith("logo.png");
        System.out.println("Ends with filepath: " + endWithTxt);
        endWithTxt = filePath.endsWith("png");
        System.out.println("Ends with string: " + endWithTxt);

        boolean startWithPics = filePath.startsWith("pics");
        System.out.println("Starts with filepath: " + startWithPics);
    }
}
