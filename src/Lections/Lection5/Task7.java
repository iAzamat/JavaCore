package Lections.Lection5;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("The cat wants to play with you",
                "But you don't want to play with it");

        try {
            Path file = Files.createFile(Paths.get("cat.txt"));

            if (Files.exists(file)) {
                Files.write(file, lines, StandardCharsets.UTF_8);
                lines = Files.readAllLines(Paths.get("cat.txt"), StandardCharsets.UTF_8);

                for (String s : lines) {
                    System.out.println(s);
                }
            }
           Files.delete(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
