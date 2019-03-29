package ru.job4j.array;

/**
 * Перемножение индексов двумерного массива
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 29.03.2019
 */
public class Matrix {
    /**
     *
     * @param size размер массива.
     * @return массив заполненный перемноженными индексами.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int indexm = 0; indexm < table.length; indexm++) {
            for (int indexn = 0; indexn < table.length; indexn++) {
                table[indexm][indexn] = (indexm + 1) * (indexn + 1);
            }
        }
        return table;
    }
}
