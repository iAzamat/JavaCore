package Lections.Lection2;

public class Main {

    private static int sum(int a, int b) {
        return a + b;
    }

    private static float sum(float a, float b) {
        return 0;
    }

    public static void main(String[] args) {

        byte a = 8;
        short b = 16;
        int d = 32;
        long e = 64;
        char c = 0;
        float f = 0;
        double g = 0;
        boolean h = true; // 1 байт = 8 бит


//        byte b0 = 100;
//        byte b1 = 200;
//        long l0 = 5_000_000_000;
//        long l1 = 5_000_000_000L;
//        float f0 = 0.123;
//        float f1 = 0.123f;

//        char c0 = 72;
//        char c1 = 'H';
//        char c2 = "H";
//
//        String s0 = "H";
//        String s1 = 'H';
//
//        char c0;
//        c0 = 'H';
//        char c1 = 'H';

        int i0 = 100;
//        byte b0 = i0;

        byte b0 = (byte) i0;

//        int[] array3 = {5, 4, 3, 2, 1};
//        int[] array2 = new int[5];
//        int[] array1 = array2;
//        int[] array0;

//        array2 = {1, 2, 3, 4, 5};

//        final byte array[] = {1, 2, 3};
//        a = b;
//        array[1] = 5;

//        // memory leak
//        int[][] arr0 = new int[3][3];
//        arr0[0] = new int[3];
//        arr0[1] = new int[5];
//        arr0[2] = new int[7];
//
//        int[][] arr = new int[3][];
//        arr[0] = new int[3];
//        arr[1] = new int[5];
//        arr[2] = new int[7];

//        int adult = 18;
//        int age = 10;
//        if (age < adult) {
//            // deny something
//        } else if (age == adult) {
//            // congratulations
//        } else {
//            // allow something
//        }

//        int address = 5;
//        switch (address) {
//            case 1 -> System.out.println("director's desk");
//            case 2 -> System.out.println("manager's desk");
//            case 3 -> System.out.println("developer's desk");
//            default -> System.out.println("unknown recipient");
//        }

//        while (){}
//        do {} while ();
//        for(;;){}

//        for (:) {}

//        функция(параметр 1, параметр 2) {
//            Тело
//        } ;
//
//        функция(аргумент 1, аргумент 2);
//        Методы в стиле lowerCamelCase;

        System.out.println(sum(2,2));
        System.out.println(sum(2.0f,2.0f));
    }
}
