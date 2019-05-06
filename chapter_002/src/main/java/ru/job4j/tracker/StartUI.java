package ru.job4j.tracker;

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
     * Константа для полученя ID заявки.
     */
    private static final String FindID = "4";

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
                tracker.findAll();
            } else if (Edit.equals(answer)) {

                tracker.replace()
            } else if (Delete.equals(answer)){
                tracker.delete()

            } else if (FindID.equals(answer)){
                tracker.findById()

            } else if (FindName.equals(answer)) {
                tracker.findByName()

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
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0 - создать новую заявку");
        System.out.println("1 - показать все заявки");
        System.out.println("2 - изменить заявку");
        System.out.println("3 - удалить заявку");
        System.out.println("4 - получить ID заявки");
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