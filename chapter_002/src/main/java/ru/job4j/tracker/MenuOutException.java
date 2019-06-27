package ru.job4j.tracker;

/**
 * Обработка исключений.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 27.06.2019
 */

public class MenuOutException extends RuntimeException {

    public MenuOutException(String msg) {
        super(msg);
    }
}
