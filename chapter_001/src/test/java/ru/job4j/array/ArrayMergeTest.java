package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class ArrayMerge.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 13.04.2019
 */

public class ArrayMergeTest {

    @Test
    public void mergeLeftAndRight() {
        ArrayMerge mergeArray = new ArrayMerge();
        int[] leftInput = {1, 3};
        int[] rightInput = {2, 5};
        int[] result = mergeArray.merge(leftInput, rightInput);
        int[] expect = {1, 2, 3, 5};
        assertThat(result, is(expect));

    }

}
