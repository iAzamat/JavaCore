package Lections.Lection5;

import java.nio.charset.StandardCharsets;

public class Task16 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Home");
        String s3 = new String(new char[]{'A', 'B', 'C'});
        String s4 = new String(s3);
        String s5 = new String(new byte[]{65, 66, 67});
        String s6 = new String(new byte[]{0, 65, 0, 66}, StandardCharsets.UTF_16);

        System.out.printf("s1: %s\ns2: %s\ns3: %s\ns4: %s\ns5: %s\ns6: %s\n", s1, s2, s3, s4, s5, s6);
    }
}
