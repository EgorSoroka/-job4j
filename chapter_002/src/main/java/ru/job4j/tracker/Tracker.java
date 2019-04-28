package ru.job4j.tracker;


import java.util.Arrays;
import java.util.Random;

/**
 *  Обертка массива.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 28.04.2019
 */


public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;

    /**
     * Метод добавляет новую заявку.
     *
     * @param item Новая раявка.
     * @return массив заявок с новой заявкой.
     */

    public Item add(Item item) { // тест написан
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует ключ id для каждой заявки на основе времени.
     *
     * @return Id.
     */
    private String generateId() {
        long time = System.currentTimeMillis();
        Random rand = new Random();
        return String.valueOf(time * (rand.nextInt() + 1));
    }

    /**
     * Метод заменяет ячейку в массиве items по Id.
     *
     * @param id   Id заявки/
     * @param item
     * @return возвращает результат операции true || false.
     */
    public boolean replace(String id, Item item) { //тест написан.
        boolean result = false;
        for (int index = 0; index < position; index++) {
            if (this.items[index].getId().equals(id)) {
                item.setId(id);
                this.items[index] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод уддаляет заявку.
     *
     * @param id Id заявки, которую нужно удалить.
     * @return возвращает результат операции true || false.
     */
    public boolean delete(String id) { // тест написан.
        boolean result = false;
        for (int index = 0; index < position; index++) {
            if (this.items[index].getId().equals(id)) {
                System.arraycopy(items, index + 1, items, index, position);
                result = true;
                position--;
                break;
            }
        }
        return result;

    }

    /**
     * Возвращает копию массива без null элементов.
     *
     * @return массив без null элементов.
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Выдает поименный список заявок.
     *
     * @param key имя заяввки.
     * @return результирующий массив с запрашиваемыми заявками по именам.
     */
    public Item[] findByName(String key) { // тест написан.
        int count = 0;
        Item[] arrayName = new Item[100];
        for (int index = 0; index < position; index++) {
            if (this.items[index].getName().equals(key)) {
                arrayName[count++] = items[index];
            }
        }
        return Arrays.copyOf(arrayName, count);

    }

    /**
     * Получает заявку по Id.
     *
     * @param id Id заявки.
     * @return Заявка, если есть.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}
