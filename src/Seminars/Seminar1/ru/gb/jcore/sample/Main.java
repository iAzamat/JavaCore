package Seminars.ru.gb.jcore.sample;

import Seminars.ru.gb.jcore.regular.Calculator;
import Seminars.ru.gb.jcore.regular.Decorator;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */
public class Main {

    /**
     * Точка входа в программу с неё всегда всё начианается
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = Calculator.add(2, 4);
        System.out.println(Decorator.decorate(result));
        result = Calculator.sub(2, 4);
        System.out.println(Decorator.decorate(result));
        result = Calculator.mul(2, 4);
        System.out.println(Decorator.decorate(result));
        result = Calculator.div(2, 4);
        System.out.println(Decorator.decorate(result));
    }
}
