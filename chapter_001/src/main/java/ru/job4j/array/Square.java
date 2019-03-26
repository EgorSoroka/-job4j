package ru.job4j.array;

/**
 *  Заполняет массив числами возведенными в квадрат.
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 26.03.2019
 */

public class Square {
    /**
     *
     *
     * @param bound ндекс массива
     * @return заполненный массив.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int x = 1;
        for (int index = 0; index != bound; index++) {
         rst [index] = x * x;
         x++;
        }
        return rst;
    }
}
