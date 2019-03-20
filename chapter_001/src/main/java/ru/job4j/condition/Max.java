package ru.job4j.condition;

/**
 *  Класс вычисляет максимум из двух чисел.
 * @author @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 20.03.2019
 */

public class Max {
    /**
     *
     * @param left число 1.
     * @param right число 2.
     * @return наибольшее число.
     */
    public int max(int left, int right) {
        return  left > right ? left : right;
    }
}
