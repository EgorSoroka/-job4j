package ru.job4j.loop;

/**
 *  Вычисление суммы 4 чисел.
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 22.03.2019
 *
 */

public class Counter {
    /**
     * @param start число.
     * @param finish число.
     * @return сумма чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int x = start; x <= finish; x++) {
            if (x % 2 == 0) {
                sum = x + sum;
            }

        }
        return sum;
    }
}