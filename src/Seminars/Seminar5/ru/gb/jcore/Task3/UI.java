package Seminars.Seminar5.ru.gb.jcore.Task3;

import java.util.Scanner;

public class UI {
    static Scanner scanner = new Scanner(System.in);

    public static String input(String message) {
        String text;
        System.out.printf("Введите %s: \n", message);
        text = scanner.nextLine();
        while (text.isEmpty()) {
            text = input(message);
        }
        return text;
    }
}
