package ru.job4j.loop;

/**
 * Рисует пирамиду в псевдографике.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 25.03.2019
 */

public class Paint {
    /**
     * @param h высота пирамиды.
     * @return пирамида.
     */
    public String piramid(int h) {
        StringBuilder screen = new StringBuilder();
        int width = 2 * h - 1;
        for (int row = 0; row != h; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= h - column - 1 && row + h - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
