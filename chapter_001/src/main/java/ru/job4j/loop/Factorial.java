package ru.job4j.loop;

/**
 *  Считает факториал числа.
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 22.03.2019
 */

public class Factorial {
    /**
     *
     * @param n число факториал которого нужно найти.
     * @return факториал числа.
     */
    public int calc(int n) {
        int result = 1;
        for (int x = 1; x <= n; x++) {
        result = result * x;

        }
        return result;
    }
}
