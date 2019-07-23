package ru.job4j.loop;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Класс тест для Fitness.
 *
 * @author @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 23.07.2019
 */

public class TestFitness {
    @Test
    public void testFit1() {
        Fitness fit = new Fitness();
        int monch = fit.calc(40, 60);
        assertThat(monch, is(1));
    }
    @Test
    public void testFit2() {
        Fitness fit = new Fitness();
        int monch = fit.calc(20, 60);
        assertThat(monch, is(3));
    }
    @Test
    public void testFit3() {
        Fitness fit = new Fitness();
        int monch = fit.calc(61, 60);
        assertThat(monch, is(0));
    }
}
