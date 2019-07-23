package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Класс тест для Morgage.
 *
 * @author @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 23.07.2019
 */
public class TestMortgage {
    @Test
    public void when1Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 100, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 10, 50);
        assertThat(year, is(2));
    }

    @Test
    public void when3Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(200, 10, 50);
        assertThat(year, is(3));
    }
}
