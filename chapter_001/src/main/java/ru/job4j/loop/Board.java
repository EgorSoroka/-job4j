package ru.job4j.loop;

/**
 * Рисует шахматную доску.
 * @author  Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 25.03.2019
 */

public class Board {
    /**
     *
     * @param width Ширина доски.
     * @param height Высота доски.
     * @return шахматную доску.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
               boolean z =  (x + y) % 2 == 0;
                if (z) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
