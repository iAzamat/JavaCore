package Homeworks.HW1.regular;

/**
 * Класс Игрок для указания имени и количества очков
 */
public class Player {

    private String name;
    private int score;

    /**
     * Констуктор для создания экземпляра класса
     * @param name имя игрока
     */
    public Player(String name) {
        this.name = name;
        this.score = 1100;
    }

    /**
     * Геттер для получения имени
     * @return возвращает имя
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для подсчета очков
     * @param numTries получает на вход количество попыток
     * @return возвращает количество очков
     */
    public int updateScore(int numTries) {
        return score -= 100 * numTries;
    }
}
