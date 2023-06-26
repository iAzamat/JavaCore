package Seminars.Seminar4.ru.gb.jcore.Task2;

import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {
        String login = UI.input("Please enter login");
        String password = UI.input("Please enter password");
        String confirmPassword = UI.input("Please enter confirmPassword");
        try {
            System.out.println(LoginPassChecker.checker(login, password, confirmPassword));
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}
