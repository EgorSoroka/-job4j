package ru.job4j.array;

import org.junit.Test;


import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;

/**
 * Test class ArrayDup.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 30.03.2019
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate dup = new ArrayDuplicate();
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = dup.remove(input);
        String[] expected = {"Привет", "Мир", "Супер"};
        assertThat(result, arrayContainingInAnyOrder(expected));
    }

    @Test
    public void sashaTest() {
        ArrayDuplicate dup = new ArrayDuplicate();
        String[] input = {"Шла", "Саша", "По", "Шоссе", "и", "Сосала", "Сушку"};
        String[] result = dup.remove(input);
        String[] expected = {"Шла", "Саша", "По", "Шоссе", "и", "Сосала", "Сушку"};
        assertThat(result, arrayContainingInAnyOrder(expected));
    }
}