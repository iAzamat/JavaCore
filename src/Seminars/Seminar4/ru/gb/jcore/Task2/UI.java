package Seminars.Seminar4.ru.gb.jcore.Task2;

import java.util.Scanner;

public class UI {

    public static String input(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg + ": ");
        return sc.nextLine();
    }
}
