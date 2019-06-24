package ru.job4j.tracker;

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
