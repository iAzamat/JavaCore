package Seminars.Seminar5.ru.gb.jcore.Task3;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String login = UI.input("логин");
        String password = UI.input("пароль");
        String hashPassword = Validator.hashPassword(password);
        String DBName = "DB.txt";
        String delimiter = ":";

        MyFileHandler DB = new MyFileHandler(DBName);

        int lineNumber = DB.searchInFile(login, delimiter);

        if (lineNumber == -1) {
            DB.write(login + delimiter + hashPassword);
            System.out.println("Login not existed, created new");
        } else {
            String readedHashPassword = DB.read(lineNumber).split(delimiter)[1];
            if (hashPassword.equals(readedHashPassword)) {
                System.out.println("Login found, password accepted");
            } else {
                System.out.println("Login found, but password declined");
            }
        }
    }
}
