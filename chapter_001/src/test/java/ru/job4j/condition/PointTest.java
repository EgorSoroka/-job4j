package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тест class Piont
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 18.03.2019
 */
public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point();
        double result = point.distance(0, 0, 0, 10);
        assertThat(result, is(10D));
    }
}