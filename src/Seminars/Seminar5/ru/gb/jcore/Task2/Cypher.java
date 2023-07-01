package Seminars.Seminar5.ru.gb.jcore.Task2;

public class Cypher {
    public static String encrypt(String openText, int shift) {
        char[] temp = openText.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (char) ((int) temp[i] + shift);
        }
        return new String(temp);
    }

    public static String dencrypt(String openText, int shift) {
        char[] temp = openText.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (char) ((int) temp[i] - shift);
        }
        return new String(temp);
    }
}
