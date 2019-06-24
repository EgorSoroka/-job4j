package ru.job4j.tracker;

public class MenuTracker {
    /**
     * @param хранит ссылку на объект .
     */
    private Input input;
    /**
     * @param хранит ссылку на объект .
     */
    private Tracker tracker;
    /**
     * @param хранит ссылку на массив типа UserAction.
     */
    private UserAction[] actions = new UserAction[5];

    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.length - 1;
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions() {
        this.actions[0] = new AddItem();
        this.actions[1] = new ShowItem();
        this.actions[2] = new EditItem();
        this.actions[3] = new DeleteItem();
        this.actions[4] = new FindById();
        this.actions[5] = new FindByName();
        this.actions[6] = new ExitProgram(6, "Exit Program"));
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Класс реализует создание новой заявки.
     */
    public class AddItem implements UserAction {
        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Добавление новой заявки --------------");
            String name = input.ask("------------ Введите имя заявки ------------ :");
            String desc = input.ask("------------ Введите описание заявки ------------ :");
            long time = System.currentTimeMillis();
            Item item = new Item(name, desc, time);
            tracker.add(item);
            System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
        }

        @Override
        public String info() {
            return " Создание новой заявки. ";
        }
    }

    /**
     * Класс отображает все заявки.
     */
    public class ShowItem implements UserAction {
        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (Item items : tracker.findAll()) {
                System.out.println(
                        String.format("Id: %s Name: %s Description: %s", items.getId(), items.getName(), items.getDecs()));
            }
        }

        @Override
        public String info() {
            return " Показать все заявки. ";
        }
    }

    /**
     * Класс реализует редактирование заявки.
     */
    public class EditItem implements UserAction{
        @Override
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Редактирование заявки по ID ------------");
            String id = input.ask("------------ Введите ID заявки ------------");
            System.out.println("------------ Редактирование заявки ------------");
            String name = input.ask("------------ Введите имя заявки ------------ :");
            String desc = input.ask("------------ Введите описание заявки ------------ :");
            long time = System.currentTimeMillis();
            Item item = new Item(name, desc, time);
            if (tracker.replace(id, item)) {
                System.out.println("   Ваша заявка с getId : " + item.getId() + "   ");
            } else {
                System.out.println("------------ Ваша заявка не найдена ------------");
            }
        }

        @Override
        public String info() {
            return " Изменяет заявку. ";
        }
    }

    /**
     * Класс реализует удаление заявки.
     */
    public class DeleteItem implements UserAction{
        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Удаление заявки ------------");
            String delete = input.ask("------------ Введите ID заявки ------------");
            if (tracker.delete(delete)) {
                System.out.println("------------ Заявка удалена ------------");
            } else {
                System.out.println("------------ Заявка с таким ID не найдена ------------");
            }
        }

        @Override
        public String info() {
            return " Удаляет заявку. ";
        }
    }

    /**
     * Класс реализует поиск заявки по ID.
     */
    public class FindById implements UserAction{
        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Поиск по ID ------------");
            String id = input.ask("------------ Введите ID заявки ------------");
            Item found = tracker.findById(id);
            if (found != null) {
                System.out.println(String.format("Id: %s Name: %s Description: %s",
                        found.getId(), found.getName(), found.getDecs()));
            } else {
                System.out.println("------------ Нет заявки с таким ID ------------");
            }
        }

        @Override
        public String info() {
            return " Получает заявку по ID. ";
        }
    }

    /**
     * Класс реализует поиск всех заявок по имени.
     */
    public class FindByName implements UserAction{
        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Поиск заявки по имени ------------");
            String name = input.ask("------------ Введите имя заявки ------------");
            Item[] items = tracker.findByName(name);
            if (items.length > 0) {
                for (Item item : items) {
                    System.out.println(String.format("Id: %s Name: %s Description: %s",
                            item.getId(), item.getName(), item.getDecs()));
                }
            } else {
                System.out.println("------------ Заявок с таким именем не существует ------------");
            }
        }

        @Override
        public String info() {
            return " Получение заявок по имени. ";
        }
    }

}
