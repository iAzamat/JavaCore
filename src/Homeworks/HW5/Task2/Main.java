package Homeworks.HW5.Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String fileName = "gameData.bin";
        TicTacToe.gameStart(fileName);
        int[] numbers = TicTacToeField.loadField(fileName);
        System.out.println("Состояние игрового поля:\n" + Arrays.toString(numbers));
    }
}
