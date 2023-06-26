package Seminars.Seminar4.ru.gb.jcore.Task2;

import java.lang.invoke.WrongMethodTypeException;

public class LoginPassChecker {
    public static boolean checker(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        int count = 5;
        if (login.length() > count) {
            throw new WrongLoginException(String.format("login length is more then %d symbols", count));
        }
        if (password.length() > count) {
            throw new WrongPasswordException(String.format("password length is more then %d symbols", count));

        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password and confirmPassword are not equal");

        }
        return true;
    }
}
