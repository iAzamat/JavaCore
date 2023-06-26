package Seminars.Seminar4.ru.gb.jcore.Task2;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {

    }

    public WrongPasswordException(String msg) {
        super(msg);
    }
}
