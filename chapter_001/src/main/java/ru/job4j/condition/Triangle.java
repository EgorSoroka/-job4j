package ru.job4j.condition;

/**
 *  Вычисление площади треугольника.
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 20.03.2019
 */

public class Triangle {
    /**
     * Метод вычисления периметра по длинам сторон.
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Перимент.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод должен вычислить прощадь треугольканива.
     * @param x1 точка в системе координат x1.
     * @param y1 точка в системе координат y1.
     * @param x2 точка в системе координат x2.
     * @param y2 точка в системе координат y2.
     * @param x3 точка в системе координат x3.
     * @param y3 точка в системе координат y3.
     * @return Площадь треугольника.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p -c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return возможность построить треугольник.
     */
    private boolean exist(double a, double c, double b) {
        return a < c + b || b < a + c || c < a + b;
    }

}
