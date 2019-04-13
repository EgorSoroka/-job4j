package ru.job4j.array;

/**
 * Слияние массивов.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 13.04.2019
 */
public class ArrayMerge {
    /**
     * @param left  первый отсортированный массив.
     * @param right второй отсортированный массив.
     * @return result - обьедененный массив.
     */
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int index = 0; index < result.length; index++) {
            if (leftIndex >= left.length) {
                result[index] = right[rightIndex];
                rightIndex += 1;
            } else if (rightIndex >= right.length) {
                result[index] = left[leftIndex];
                leftIndex += 1;
            } else if (left[leftIndex] < right[rightIndex]) {
                result[index] = left[leftIndex];
                leftIndex += 1;
            } else {
                result[index] = right[rightIndex];
                rightIndex += 1;
            }
        }
        return result;
    }
}
