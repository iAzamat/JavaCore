package Lections.Lection3.ru.gb.jcore;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "Белый", 4);
        Cat cat2 = new Cat("Мурзик", "Черный", 6);
        System.out.println(cat1);
        System.out.println(cat2);

        cat1.jump();
        cat1.voice();
        cat2.jump();
        cat2.voice();
    }
}
