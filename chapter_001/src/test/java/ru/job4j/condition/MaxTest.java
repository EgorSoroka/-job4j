package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест class Max.
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 20.03.2019
 */
public class MaxTest {
    /**
     * Тест при max == right.
     */
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     *  Тест при max == left.
     */
    @Test
    public void whenMin1ToThen2() {
        Max max = new Max();
        int result = max.max(3, 2);
        assertThat(result, is(3));
    }
}