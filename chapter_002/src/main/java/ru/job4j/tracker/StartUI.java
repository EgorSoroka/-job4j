package ru.job4j.tracker;

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
        for (Item items : this.tracker.findAll()) {
            System.out.println(
                    String.format("Id: %s Name: %s Description: %s", items.getId(), items.getName(), items.getDecs()));
        }
    }

    /**
     * Метод редактирует заявку.
     */
    private void editItem() {
        System.out.println("   Редактирование заявки по ID   ");
        String id = this.input.ask("Введите ID заявки");
        System.out.println("   Редактирование заявки   ");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        long time = System.currentTimeMillis();
        Item item = new Item(name, desc, time);
        this.tracker.replace(id, item);
        System.out.println("   Ваша заявка с getId : " + item.getId() + "   ");
    }

    /**
     * Метод удаляет заявку.
     */
    private void deleteItem() {
        System.out.println("   Удаление заявки   ");
        String delete = this.input.ask("   Введите ID заявки   ");
        this.tracker.delete(delete);
        System.out.println("   Заявка удалена   ");
    }

    /**
     * Метод ищет заявку по ID.
     */
    private void findByID() {
        System.out.println("Поиск по ID");
        String id = this.input.ask("   Введите ID заявки   ");
        Item found = this.tracker.findById(id);
        if (found != null) {
            System.out.println(String.format("Id: %s Имя: %s Описание: %s",
                    found.getId(), found.getName(), found.getDecs()));
        } else {
            System.out.println("   Нет заявки с таким ID   ");
        }
    }

    /**
     * Метод ищет заявку по имени.
     */
    private void findByName() {
        System.out.println("   Поиск заявки по имени   ");
        String name = this.input.ask("   Введите имя заявки   ");
        Item[] items = this.tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(String.format("Id: %s Name: %s Description: %s",
                        item.getId(), item.getName(), item.getDecs()));
            }
        } else {
            System.out.println("   Заявок с таким именем не существует   ");
        }

    }

    /**
     * Метод отображает меню.
     */
    private void showMenu() {
        System.out.println("   Меню.   ");
        System.out.println("0 - создать новую заявку");
        System.out.println("1 - показать все заявки");
        System.out.println("2 - изменить заявку");
        System.out.println("3 - удалить заявку");
        System.out.println("4 - получить заявку по ID");
        System.out.println("5 - получить все заявки по имени");
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