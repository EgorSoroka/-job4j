package ru.job4j.array;

/**
 *  сортировка пузырьком.
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 28.03.2019
 */
public class BubbleSort {
    /**
     *
     * @param array массив чисел.
     * @return отсортированный массив.
     */
    public int[] sort(int[] array) {
       boolean sort = false;
       int x;
       while (!sort) {
           sort = true;
           for (int index = 0; index < array.length - 1; index++) {
               if (array[index] > array[index + 1]) {
                   sort = false;
                   x = array[index];
                   array[index] = array[index + 1];
                   array[index + 1] = x;
               }
           }
       }
       return array;
    }
}
