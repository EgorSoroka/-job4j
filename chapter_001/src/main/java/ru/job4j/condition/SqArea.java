package ru.job4j.condition;

/**
 * Класс вычисляет площадь прямоугольника.
 *
 * @author @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 22.07.2019
 */

public class SqArea {
    /**
     * Метод подсчета площади через периметр и переменную k.
     * @param p периметр прямоугольника.
     * @param k переменная во сколько ширина больше высоты.
     * @return площадь
     */

    public static int square(int p, int k) {
        int h = (p / 2) / (k + 1);
        int w = h * k;
        int s = w * h;
        return s;
    }

}
