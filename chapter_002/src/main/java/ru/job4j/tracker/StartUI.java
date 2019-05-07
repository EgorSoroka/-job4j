package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа для отображения всех заявок.
     */
    private static final String Show = "1";

    /**
     * Константа для редактирования заявки.
     */
    private static final String Edit = "2";

    /**
     * Константа для удаления заявки.
     */
    private static final String Delete = "3";

    /**
     * Константа для полученя заявки по ID.
     */
    private static final String FindByID = "4";

    /**
     * Константа для получения имени заявки.
     */
    private static final String FindName = "5";

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
            } else if (Show.equals(answer)){
                this.showItem();
            } else if (Edit.equals(answer)) {
                this.editItem();
            } else if (Delete.equals(answer)){
               this.deleteItem();
            } else if (FindByID.equals(answer)){
               this.findByID();
            } else if (FindName.equals(answer)) {
                this.findByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }

    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        long time = System.currentTimeMillis();
        Item item = new Item(name, desc, time);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * Метод выводит список всех заявок.
     */
    private void showItem() {
        System.out.println(Arrays.toString(this.tracker.findAll()));
    }

    /**
     * Метод редактирует заявку.
     */
    private void editItem(){
        System.out.println("   Редактирование заявки по ID   ");
        String id = this.input.ask("Введите ID заявки");
        this.tracker.replace(id); // как-то передать массив items
        System.out.println("   Редактирование заявки   ");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        long time = System.currentTimeMillis();
        Item item = new Item(name, desc, time);
        this.tracker.add(item);
        System.out.println("   Ваша заявка с getId : " + item.getId() + "   ");
    }

    /**
     * Метод удаляет заявку.
     */
    private void deleteItem(){
        System.out.println("   Удаление заявки   ");
        String delete = this.input.ask("   Введите ID заявки   ");
        this.tracker.delete(delete);
    }

    /**
     * Метод ищет заявку по ID.
     */
    private void findByID(){
        System.out.println("Поиск по ID");
        String id = this.input.ask("   Введите ID заявки   ");
        System.out.println(this.tracker.findById(id));
    }

    /**
     * Метод ищет заявку по имени.
     */
    private void findByName() {
        System.out.println("   Поиск заявки по имени   ");
        String name = this.input.ask("   Введите имя заявки   ");
        System.out.println(Arrays.toString(this.tracker.findByName(name)));
    }

    /**
     * Метод отображает меню.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0 - создать новую заявку");
        System.out.println("1 - показать все заявки");
        System.out.println("2 - изменить заявку");
        System.out.println("3 - удалить заявку");
        System.out.println("4 - получить заявку по ID");
        System.out.println("5 - получить имя заявки" );
        System.out.println("6 - Выход");
    }

    /**
     * Запускт программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}