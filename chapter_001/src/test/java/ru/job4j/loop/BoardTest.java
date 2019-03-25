package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест class Board.
 * @author  Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 25.03.2019
 *
 */

public class BoardTest {
    /**
     * Тест с размерами доски 3 на 3.
     */
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x%s x %sx x%s", line, line, line);
        assertThat(result, is(expected));
    }

    /**
     * Тест с размерами доски 5 на 4.
     */
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
       Board board = new Board();
       String result = board.paint(5, 4);
       final String line = System.getProperty("line.separator");
       String expected = String.format("x x x%s x x %Sx x x%S x x %S", line, line, line, line);
       assertThat(result, is(expected));
    }
}