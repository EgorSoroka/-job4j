package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест class BubbleSort
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 28.03.2019
 */

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
       BubbleSort sort = new BubbleSort();
       int[] input = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
       int[] result = sort.sort(input);
       int[] expected = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
       assertThat(result, is(expected));
    }
}
