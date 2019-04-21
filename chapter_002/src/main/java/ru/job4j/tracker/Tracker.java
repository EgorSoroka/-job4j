package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    private String generateId() {
        long time = System.currentTimeMillis();
        Random rand = new Random();
        String generatedId = String.valueOf(time * (rand.nextInt() + 1));
        return generatedId;
    }

    public boolean replace(String id, Item item) {

    }

    public boolean delete(String id) {

    }

    public Item[] findAll() {

    }

    public Item[] findByName(String key) {

    }

    public Item findById(String id) {

    }
}
