package ru.job4j.tracker;

public class MenuTracker {
    /**
     *  Хранит ссылку на объект.
     */
    private Input input;
    /**
     *  Хранит ссылку на объект .
     */
    private Tracker tracker;
    /**
     * Хранит ссылку на массив типа UserAction.
     */
    private UserAction[] actions = new UserAction[7];
    /**
     *  Позиция элемента в массиве меню.
     */


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
         return this.actions.length;
     }

    /**
     * Метод заполняет массив.
     */
    public void fillActions(StartUI ui) {
        this.actions[0] = new AddItem(0,  " Дабовить новую заявку ");
        this.actions[1] = new ShowItem(1, " Показать все заявки ");
        this.actions[2] = new EditItem(2,  " Изменить заявку ");
        this.actions[3] = new DeleteItem(3, " Удалить заявку ");
        this.actions[4] = new FindById(4, " Получить заявку по ID ");
        this.actions[5] = new FindByName(5, " Поиск заявок по имени ");
        this.actions[6] = new ExitProgram(ui, 6, " Выйти из программы ");
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
    private class AddItem extends BaseAction {
       public  AddItem(int key, String name) {
           super(key, name);
       }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(" Добавление новой заявки ");
            String name = input.ask(" Введите имя заявки  :");
            String desc = input.ask(" Введите описание заявки:");
            long time = System.currentTimeMillis();
            Item item = new Item(name, desc, time);
            tracker.add(item);
            System.out.println(" Новая заявка с getId : " + item.getId());
        }

    }

    /**
     * Класс отображает все заявки.
     */
    private class ShowItem extends BaseAction {
       public ShowItem(int key, String name) {
           super(key, name);
       }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (Item items : tracker.findAll()) {
                System.out.println(
                        String.format("Id: %s Name: %s Description: %s", items.getId(), items.getName(), items.getDecs()));
            }
        }
    }

    /**
     * Класс реализует редактирование заявки.
     */
    private class EditItem extends BaseAction {
        public EditItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(" Редактирование заявки по ID ");
            String id = input.ask(" Введите ID заявки ");
            System.out.println(" Редактирование заявки ");
            String name = input.ask(" Введите имя заявки: ");
            String desc = input.ask(" Введите описание заявки:");
            long time = System.currentTimeMillis();
            Item item = new Item(name, desc, time);
            if (tracker.replace(id, item)) {
                System.out.println("   Ваша заявка с getId : " + item.getId() + "   ");
            } else {
                System.out.println("------------ Ваша заявка не найдена ------------");
            }
        }
    }

    /**
     * Класс реализует удаление заявки.
     */
    private class DeleteItem extends BaseAction {
        public DeleteItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(" Удаление заявки ");
            String delete = input.ask(" Введите ID заявки ");
            if (tracker.delete(delete)) {
                System.out.println(" Заявка удалена ");
            } else {
                System.out.println(" Заявка с таким ID не найдена ");
            }
        }
    }

    /**
     * Класс реализует поиск заявки по ID.
     */
    private class FindById extends BaseAction {
        public FindById(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(" Поиск по ID ");
            String id = input.ask(" Введите ID заявки ");
            Item found = tracker.findById(id);
            if (found != null) {
                System.out.println(String.format("Id: %s Name: %s Description: %s",
                        found.getId(), found.getName(), found.getDecs()));
            } else {
                System.out.println(" Нет заявки с таким ID ");
            }
        }
    }

    /**
     * Класс реализует поиск всех заявок по имени.
     */
    private class FindByName extends BaseAction {
        public FindByName(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(" Поиск заявки по имени ");
            String name = input.ask(" Введите имя заявки ");
            Item[] items = tracker.findByName(name);
            if (items.length > 0) {
                for (Item item : items) {
                    System.out.println(String.format("Id: %s Name: %s Description: %s",
                            item.getId(), item.getName(), item.getDecs()));
                }
            } else {
                System.out.println(" Заявок с таким именем не существует ");
            }
        }
    }

    /**
     *  Выход из программы.
     */
    private class ExitProgram extends BaseAction {
        private final StartUI ui;

        public ExitProgram(StartUI ui, int key, String name) {
            super(key, name);
            this.ui = ui;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(" Выход из программы ");
            this.ui.stop();
        }
    }
}
