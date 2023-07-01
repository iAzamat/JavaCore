package Seminars.Seminar5.ru.gb.jcore.Task3;

import java.io.*;
import java.util.List;

public class MyFileHandler {
    private File fileStorage;

    public MyFileHandler(String fileName) {
        this.fileStorage = new File(fileName);
        if (!fileStorage.exists()) {
            try {
                fileStorage.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int searchInFile(String search, String delimiter) {
        String line;
        search = search.toLowerCase() + delimiter;
        int lineNumber = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(this.fileStorage))) {
            line = reader.readLine();
            while (line != null) {
                if (line.toLowerCase().contains(search)) {
                    return lineNumber;
                } else {
                    line = reader.readLine();
                    lineNumber++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public String read(int argLineNumber) {
        String line = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(this.fileStorage))) {
            List<String> lines = reader.lines().toList();
            if (argLineNumber < lines.size() && argLineNumber >= 0) {
                line = lines.get(argLineNumber);
            } else {
                line = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    public void write(String argLine) {
        try (BufferedReader tempReader = new BufferedReader(new FileReader(this.fileStorage))) {
            List<String> lines = tempReader.lines().toList();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.fileStorage))) {
                for (String line : lines) {
                    writer.append(line.toLowerCase());
                    writer.newLine();
                }
                writer.write(argLine.toLowerCase());
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
