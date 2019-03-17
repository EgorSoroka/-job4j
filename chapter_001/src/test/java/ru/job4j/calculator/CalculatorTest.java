package ru.job4j.calculator;



import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест на class Calculator
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 */

public class CalculatorTest  {
    /**
     * Тест метода add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Тест метода subtract.
     */
    @Test
    public void  subtractTest() {
        Calculator calc = new Calculator();
        double result = calc.subtract(2D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     * Тест метода div.
     */
    @Test
    public void divTest() {
        Calculator calc = new Calculator();
        double result = calc.div(6D, 2D);
        double expected = 3D;
        assertThat(result, is(expected));
    }
    /**
     * Тест метода multiple.
     */
    @Test
    public void multipleTest() {
        Calculator calc = new Calculator();
        double result = calc.multiple(2D, 2D);
        double expected = 4D;
        assertThat(result, is(expected));
    }
}