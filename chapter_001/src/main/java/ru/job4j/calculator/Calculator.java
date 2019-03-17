package ru.job4j.calculator;

/**
 * Класс выполняет функцию калькулятора и выводит значения "+,-,*,/".
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 */


public class Calculator {
    /**
     * Метод выводит сумму двух чисел.
     * @param first число с плавающей точкой.
     * @param second число с плавающей точкой.
     * @return first + second
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Метод выводит разницу двух чисел.
     * @param first число с плавающей точкой.
     * @param second число с плавающей точкой.
     * @return first - second
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     *
     * @param first число с плавающей точкой.
     * @param second число с плавающей точкой.
     * @return first / second
     */
    public  double div(double first, double second) {
        return first / second;
    }

    /**
     *
     * @param first число с плавающей точкой.
     * @param second число с плавающей точкой.
     * @return first * second
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}
