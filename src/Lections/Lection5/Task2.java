package Lections.Lection5;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Task2 {
    public static void main(String[] args) {
        // Файловая система
        try {
            FileSystem fileSystem = FileSystems.getDefault();
            for (Path rootdir : fileSystem.getRootDirectories()) {
                System.out.println(rootdir.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
