package ru.job4j.tracker;

/**
 * Интерфейс действий пользователя.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 27.06.2019
 */

public interface UserAction {
    /**
     * Метод возвращает ключ опции.
     * @return ключ
     */
    int key();
    /**
     * Основной метод.
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    void execute(Input input, Tracker tracker);
    /**
     * Метод возвращает информацию о данном пункте меню.
     * @return Строка меню
     */
    String info();
}
