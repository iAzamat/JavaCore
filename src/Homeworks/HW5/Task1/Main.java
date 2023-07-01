package Homeworks.HW5.Task1;

import Seminars.Seminar5.ru.gb.jcore.Task1.Tree;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String fileIn = "./src/Lections";
        String fileOut = "./backup";
        MyBackuper.backup(fileIn, fileOut);
//        Tree.print(new File(fileIn), "", true);
//        Tree.print(new File(fileOut), "", true);
    }
}
