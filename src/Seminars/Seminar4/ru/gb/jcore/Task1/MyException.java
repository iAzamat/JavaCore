package Seminars.Seminar4.ru.gb.jcore.Task1;

public class MyException {
    protected static final class ColumnMismatchException extends RuntimeException {
        ColumnMismatchException(String message) {
            super("Columns exception: " + message);
        }
    }

    protected static final class NumberIsNotNumberException extends RuntimeException {
        NumberIsNotNumberException(String message) {
            super("Not a number found: " + message);
        }
    }

    protected static final class RowMismatchEception extends RuntimeException {
        RowMismatchEception(int expected, int current, String value) {
            super(String.format("Rows exception: expected %d rows. Received %d rows in '%s' string", expected, current, value));
        }
    }
}
