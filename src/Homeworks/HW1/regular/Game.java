package Homeworks.HW1.regular;

import java.util.Scanner;

/**
 * Класс игры
 */
public class Game {
    Game() {

    }

    /**
     * Запуск игры
     */
    public static void start() {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int numTries = 0;
        int maxNumTries = 10;
        int guess = 0;
        boolean win = false;

        System.out.println("Введите ваше имя: ");
        String name = sc.nextLine();
        Player player = new Player(name);
        System.out.println("Угадай число от 1 до 100.\n");

        while (numTries < maxNumTries) {
            System.out.print("Введите число: ");
            guess = sc.nextInt();
            numTries++;

            if (guess < randomNumber) {
                System.out.printf("Загаданное число больше вашего. Попробуй еще раз\nПопытка [%d из %d]\n", numTries, maxNumTries);
            } else if (guess > randomNumber) {
                System.out.printf("Загаданное число меньше вашего. Попробуй еще раз\nПопытка [%d из %d]\n", numTries, maxNumTries);
            } else if (guess == randomNumber) {
                win = true;
                break;
            }
        }

        if (win) {
            System.out.printf("\n%s, Поздравляю! Ты победитель!\n", player.getName());
            System.out.println("Загаданное число: " + randomNumber + ".");
            System.out.println("Количество попыток: " + numTries + ".");
            System.out.printf("Количество очков: %d", player.updateScore(numTries));
        } else {
            System.out.printf("\n%s, Вы проиграли. Попробуйте сыграть еще раз.\n", player.getName());
            System.out.println("Загаданное число: " + randomNumber + ".");
            System.out.println("Количество попыток: " + numTries + ".\n");
        }
        sc.close();
    }
}
