package ru.job4j.figures;

/**
 *  Рисует квадрат.
 *  @author Egor Soroka ( https://vk.com/id428714363)
 *  @version 1.0
 *  @since 19.06.19
 */

public class Square implements Shape {
    /**
     * Рисует квадрат.
     * @return квадрат.
     */
    @Override
    public String draw() {
        StringBuilder square = new StringBuilder();
        square.append("++++" + "\n");
        square.append("++++" + "\n");
        square.append("++++" + "\n");
        square.append("++++" + "\n");
        return square.toString();
    }
}
