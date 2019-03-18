package ru.job4j.condition;

/**
 *  Класс вычисляет расстояние между точками в системе координат.
 *  @author Egor Soroka ( https://vk.com/id428714363)
 *  @version 1.0
 *  @since 18.03.2019
 */

public class Point {
    /**
     * @param x1 координата 1.
     * @param y1 координата 2.
     * @param x2 координата 3.
     * @param y2 координата 4.
     * @return расстояние между точками.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}