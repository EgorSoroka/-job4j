package ru.job4j.tracker;

/**
 *  Реализует пользовательский интерфейс.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 08.05.2019
 */

public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа для отображения всех заявок.
     */
    private static final String SHOW = "1";

    /**
     * Константа для редактирования заявки.
     */
    private static final String EDIT = "2";

    /**
     * Константа для удаления заявки.
     */
    private static final String DELETE = "3";

    /**
     * Константа для полученя заявки по ID.
     */
    private static final String FIND_BY_ID = "4";

    /**
     * Константа для получения имени заявки.
     */
    private static final String FIND_NAME = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";

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
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.showItem();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FIND_BY_ID.equals(answer)) {
                this.findByID();
            } else if (FIND_NAME.equals(answer)) {
                this.findByName();
            } else if (StartUI.EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод отображает меню.
     */
    private void showMenu() {
        System.out.println("------------ Меню ------------");
        System.out.println("------------ 0 - создать новую заявку ");
        System.out.println("------------ 1 - показать все заявки ");
        System.out.println("------------ 2 - изменить заявку ");
        System.out.println("------------ 3 - удалить заявку ");
        System.out.println("------------ 4 - получить заявку по ID ");
        System.out.println("------------ 5 - получить все заявки по имени ");
        System.out.println("------------ 6 - Выход ");
    }

    /**
     * Запускт программы.
     *
     * @param args start
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}