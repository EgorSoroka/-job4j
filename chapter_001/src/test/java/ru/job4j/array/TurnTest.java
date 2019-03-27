package ru.job4j.array;


import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 *  Тест class Turn.
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 27.03.2019
 */

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2, 3};
        int[] result = turner.back(input);
        int[] expect = new int[] {3, 2, 6, 1, 4};
        assertThat(result, is(expect));
    }
}