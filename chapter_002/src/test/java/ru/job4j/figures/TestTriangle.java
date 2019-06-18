package ru.job4j.figures;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class Triangle.
 *  @author Egor Soroka ( https://vk.com/id428714363)
 *  @version 1.0
 *  @since 19.06.19
 */


public class TestTriangle {
    @Test
    public void drawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringBuilder()
                                .append("+" + "\n")
                                .append("++" + "\n")
                                .append("+++" + "\n")
                                .append("++++" + "\n")
                                .toString()
                )
        );
    }

}
