package Seminars.Seminar5.ru.gb.jcore.Task3;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Validator {
    public static String hashPassword(String password) {
        StringBuilder sb = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] byteData = md.digest();
            sb = new StringBuilder();
            for (byte byteDatum : byteData) {
                sb.append(Integer.toString((byteDatum & 0xff) + 0x100, 16).substring(1));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        assert sb != null;
        return sb.toString();
    }
}
