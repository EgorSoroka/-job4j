package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *  Тест class Counter.
 * @author @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 22.03.2019
 */

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
      Counter count = new Counter();
      int x = count.add(0, 10);
      assertThat(x, is(30));
    }
}