package Lections.Lection5;

public class Task17 {
    public static void main(String[] args) {
        String a1 = "Hello ";
        String a2 = "World";
        String a3 = a1 + a2;

        System.out.println(a3);

        String b1 = "Number 10: ";
        int b2 = 10;
        String b3 = b1 + b2;

        System.out.println(b3);

        String c1 = "Home";
        String c2 = "[" + c1 + "] = " + 1;

        System.out.println(c2);


        // Ошибки при кокатенации
        String str0 = "Fifty five is " + 50 + 5;
        System.out.println(str0);
        String str1 = 50 + 5 + " = Fifty five";
        System.out.println(str1);
    }
}
