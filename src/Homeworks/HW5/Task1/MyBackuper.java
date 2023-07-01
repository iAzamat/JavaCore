package Homeworks.HW5.Task1;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class MyBackuper {
    private static List<String> listFiles = new ArrayList<>();
    private static List<String> backupListFiles = new ArrayList<>();
    private static List<String> listDirs = new ArrayList<>();
    private static List<String> backupListDirs = new ArrayList<>();

    public static void backup(String fileInName, String fileOutName) {
        File fileIn = new File(fileInName);
        File fileOut = new File(fileOutName);

        Path delPrefix = Paths.get(fileIn.getAbsolutePath()).normalize();
        Path addPrefix = Paths.get(fileOut.getAbsolutePath()).normalize();

        prepareBackup(fileIn, true);
        createBackupList(delPrefix.toString(), addPrefix.toString(), fileIn.getName().toString());

        if (!fileOut.exists()) {
            fileOut.mkdirs();
        }
        File fileCreate;
        for (String backupListDir : backupListDirs) {
            fileCreate = new File(backupListDir);
            fileCreate.mkdirs();
        }

        try {
            for (int i = 0; i < listFiles.size(); i++) {
                File fileIn2 = new File(listFiles.get(i));
                File fileOut2 = new File(backupListFiles.get(i));
                copyFileUsingStream(fileIn2, fileOut2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Backup выполнен успешно");
    }

    private static void prepareBackup(File file, boolean isLast) {
        File[] files = file.listFiles();
        if (files == null)
            return;

        int subDirTotal = 0;
        for (File item : files) {
            if (item.isDirectory())
                subDirTotal++;
        }

        int subDirCounter = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                Path path = Paths.get(files[i].getAbsolutePath());
                listDirs.add(path.normalize().toString());
                prepareBackup(files[i], subDirCounter == subDirTotal - 1);
                subDirCounter++;
            } else {
                Path path = Paths.get(files[i].getAbsolutePath());
                listFiles.add(path.normalize().toString());
                prepareBackup(files[i], i >= files.length - 1);
            }
        }
    }

    public static void createBackupList(String delPrefix, String addPrefix, String parentDir) {
        String tempLine;
        for (String listFile : listFiles) {
            tempLine = addPrefix + File.separator + parentDir + listFile.replace(delPrefix, "");
            backupListFiles.add(tempLine);
        }

        for (String listDir : listDirs) {
            tempLine = addPrefix + File.separator + parentDir + listDir.replace(delPrefix, "");
            backupListDirs.add(tempLine);
        }
    }

    public static void printList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        try (InputStream is = new FileInputStream(source); OutputStream os = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }
    }
}
