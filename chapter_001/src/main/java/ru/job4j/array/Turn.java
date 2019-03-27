package ru.job4j.array;

/**
 *  Переворачивает массив
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 27.03.2019
 */

public class Turn {
    /**
     *
     * @param array массив.
     * @return Перевернутый array.
     */
    public int[] back(int[] array) {
        int temp;
        for (int index = 0; index < array.length / 2; index++) {
            temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}
