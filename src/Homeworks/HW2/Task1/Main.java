package Homeworks.HW2.Task1;

public class Main {

    /**
     * метод, возвращающий количество чётных элементов массива.
     *
     * @param array принимает на вход массив
     * @return возвращает количество чётных элементов массива
     */
    public static int countEvens(int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Написать функцию,
     * возвращающую разницу между самым большим и самым маленьким элементами
     * переданного не пустого массива.
     *
     * @param array передаем массив
     * @return возвращает разницу для непустых массивов и -1 для пустых
     */
    private static int diffMaxMinValue(int[] array) {
        int diff = -1;

        if (array.length != 0) {
            int max = array[0];
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
                if (min > array[i]) {
                    min = array[i];
                }
            }
            diff = max - min;

        }
        return diff;
    }

    /**
     * Функция вывода в консоль
     *
     * @param array передаем массив
     */
    public static void diffMaxMinValuePrint(int[] array) {
        int result = diffMaxMinValue(array);
        if (result == -1) {
            System.out.println("Был передан пустой массив");
        } else {
            System.out.printf("Разница между самым большим и самым маленьким элементами массива равна: %d\n", result);
        }
    }


    /**
     * Написать функцию, возвращающую истину,
     * если в переданном массиве есть два соседних элемента, с нулевым значением
     *
     * @param array передаем массив
     * @return возвращает true или false
     */
    public static boolean twoZeroValue(int[] array) {
        int OneElem;
        int TwoElem;

        for (int i = 0; i < (array.length - 1); i++) {
            OneElem = array[i];
            TwoElem = array[i + 1];

            if (OneElem == 0 && TwoElem == 0) {
                return true;
            }
        }
        return false;
    }


    /**
     * Точка входа в программу
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        //Task 1
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[]{2, 2, 0}));
        System.out.println(countEvens(new int[]{1, 3, 5}));

        //Task 2
        diffMaxMinValuePrint(new int[]{2, 1, 2, 3, 4});
        diffMaxMinValuePrint(new int[]{});

        //Task 3
        System.out.println(twoZeroValue(new int[]{1, 0, 2, 1, 0, 0}));
        System.out.println(twoZeroValue(new int[]{1, 0, 2, 1, 0, 1}));

    }
}
