package Seminars.Seminar3.ru.gb.jcore.Task2;

public class Cat extends Animal {
    Cat(String name) {
        super("Cat", name, 2, 200, 1);
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_WTF;
    }
}
