package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test SqArea.
 *
 * @author @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 22.07.2019
 */


public class TestSqArea {

    @Test
    public void testSqArea() {
        int p = 24;
        int k = 3;
        int expected = 27;
        int out = SqArea.square(p, k);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void testSqAreaP30K4() {
        int p = 30;
        int k = 4;
        int expected = 36;
        int out = SqArea.square(p, k);
        Assert.assertEquals(expected, out);
    }

}
