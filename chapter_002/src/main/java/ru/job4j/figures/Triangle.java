package ru.job4j.figures;

/**
 * Рисует треугольник.
 *  @author Egor Soroka ( https://vk.com/id428714363)
 *  @version 1.0
 *  @since 19.06.19
 */

public class Triangle implements Shape {
    /**
     * Рисует треугольник.
     * @return Треугольник.
     */
    @Override
    public String draw() {
        StringBuilder tring = new StringBuilder();
        tring.append("+" + "\n");
        tring.append("++" + "\n");
        tring.append("+++" + "\n");
        tring.append("++++" + "\n");
        return tring.toString();
    }
}
