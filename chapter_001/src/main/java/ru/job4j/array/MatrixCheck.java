package ru.job4j.array;

/**
 * Проверяет заполненность true или false в квадратном массиве по диагонали.
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 29.03.2019
 */
public class MatrixCheck {
    /**
     *
     * @param data вадратный массив заполненный true или false.
     * @return результат проверки по диагонали.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean m = false;
        boolean n = false;
        for (int indexm = 1; indexm < data.length; indexm++) {
            for (int indexn = 1; indexn < data.length; indexn++) {
               if (data[0][0] == data[indexm][indexn]) {
                   m = true;
               }
               if (data[data.length - 1][0] == data[data.length - indexm - 1][indexn]) {
                    n = true;
               }
               if (!m || !n) {
                    result = false;
               }
            }
        }
        return result;
    }
}