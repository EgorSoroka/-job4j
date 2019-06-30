package ru.job4j.singletracker;

/**
 * Вариация сингл класса 1.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 30.06.2019
 */

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import java.util.Arrays;
import java.util.Random;

public enum  SingleTrackerOne {
    INSTANCE;
    private Tracker tracker = new Tracker();
    private Item[] items = new Item[100];
    private int position = 0;

    public void addItem(Item item) {
        this.tracker.add(item);
    }

    private String generateId() {
        long time = System.currentTimeMillis();
        Random rand = new Random();
        return String.valueOf(time * (rand.nextInt() + 1));
    }

    public boolean replace(String id, Item item) {
        return this.tracker.replace(id, item);
    }

    public boolean delete(String id) {
        return this.tracker.delete(id);
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    public Item[] findByName(String key) {
        return this.tracker.findByName(key);
    }

    public Item findById(String id) {
        return this.tracker.findById(id);
    }

}
