package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Egor Soroka ( https://vk.com/id428714363) 
 * @version 1.0
 * @since 16.03.2019
 */


public class CalculateTest {
 /**
 * Test echo.
 */
 @Test
 public void whenTakeNameThenThreeEchoPlusName() {
    String input = "Egor Soroka";
    String expect = "Echo, echo, echo : Egor Soroka"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
 }
 
 
}