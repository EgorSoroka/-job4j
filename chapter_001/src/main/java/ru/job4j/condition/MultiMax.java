package ru.job4j.condition;

/**
 * Выводит максимум 3 чисел.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 20.03.2019
 */

public class MultiMax {
    /**
     * @param first  число.
     * @param second число.
     * @param third  число.
     * @return Моксимальное число.
     * <p>
     * P.S. Подозреваю от меня не этого хотели. Могу представить еще "классическую" запись с вложенными if.
     */
    public int max(int first, int second, int third) {
        return first < second ? Math.max(second, third) : Math.max(first, third);
    }
}




