package ru.job4j.array;

/**
 * Перебор массив
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 27.03.2019
 */

public class FindLoop {
    /**
     * @param data массив для перебора
     * @param el   искомое число
     * @return индекс искомого числа в массиве
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

}
