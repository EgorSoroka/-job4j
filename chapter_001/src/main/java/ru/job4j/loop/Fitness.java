package ru.job4j.loop;

/**
 * Класс вычисляет количество месяцев необходимых Ивану что бы превзойти Николая.
 *
 * @author @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 23.07.2019
 */

public class Fitness {
    /**
     * Считает количество месяцев.
     * @param ivan начальные показатели Ивана.
     * @param nik начальные показатели Николая.
     * @return Количество месяцев необходимое Ивану, что бы нагнать Николая.
     */
    public  int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan = ivan * 3;
            nik = nik * 2;
            month++;
        }
        return month;
    }
}
