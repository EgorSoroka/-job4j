package ru.job4j.tracker;

/**
 *  Реализует пользовательский интерфейс.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 08.05.2019
 */

public class StartUI {
    private boolean work = true;

    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        int[] range = new int[7];
        menu.fillActions(this);
        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range[i] = i;
        }
        do {
            menu.show();
            menu.select(input.ask(" Выберете пункт меню: ", range));
        } while (!"6".equals(this.input.ask("Выйти??(6): ")));
    }

    /**
     * отсечка для выхода из программы.
     */
    public void stop() {
        this.work = false;
    }
    /**
     * Запускт программы.
     *
     * @param args start
     */
    public static void main(String[] args) {
        new StartUI(
                new ValidateInput(
                        new ConsoleInput()
                ),
                new Tracker()
        ).init();
    }
}