package Seminars.Seminar2.ru.gb.jcore;

public class СaesarСipher {

    /**
     * Шифр цезаря
     *
     * @param in
     * @param key
     * @param encrypt
     * @return
     */
    private static String caesar(String in, int key, boolean encrypt) {
        if (in == null || in.isEmpty())
            return null;

        final int len = in.length();
        char[] out = new char[len];
        for (int i = 0; i < len; i++) {
            out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key));
        }
        return new String(out);
    }

    public static String caesarDecode(String in, int key) {
        return caesar(in, key, true);
    }

    public static String caesarEncode(String in, int key) {
        return caesar(in, key, false);
    }


    public static void main(String[] args) {
        int key = (int) (Math.random() * 100) + 1;
        String result;

        String text = "Phrase";
        System.out.println(text);

        result = caesarDecode(text, key);
        System.out.println(result);

        result = caesarEncode(result, key);
        System.out.println(result);
    }
}
