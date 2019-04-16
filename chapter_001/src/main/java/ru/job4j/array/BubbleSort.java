package ru.job4j.array;

/**
 * сортировка пузырьком.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 28.03.2019
 */
public class BubbleSort {
    /**
     * @param array массив чисел.
     * @return отсортированный массив.
     */
    public int[] sort(int[] array) {
        int x;
        for (int index = 0; index < array.length - 1; index++) {
            for (int y = array.length - 1; y > index; y--) {
                if (array[y] < array[y - 1]) {
                    x = array[y];
                    array[y] = array[y - 1];
                    array[y - 1] = x;
                }
            }
        }
        return array;
    }
}
