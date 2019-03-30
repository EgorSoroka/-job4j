package ru.job4j.array;

import java.util.Arrays;

/**
 *  Удаление дубликатов в массиве.
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 30.03.2019
 */

public class ArrayDuplicate {
    /**
     *
     * @param array массив строк.
     * @return массив строк без дубликатов.
     */
    public String[] remove(String[] array) {
        int check = array.length;
        for (int out = 0; out < check; out++) {
            for (int in = out + 1; in < check; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[check - 1];
                    check--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, check);
    }
}