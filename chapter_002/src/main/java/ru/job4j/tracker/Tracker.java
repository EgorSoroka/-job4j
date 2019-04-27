package ru.job4j.tracker;


import java.util.Arrays;
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
        return String.valueOf(time * (rand.nextInt() + 1));
    }

    public boolean replace(String id, Item item) {
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

    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index < items.length - 1; index++){
            if (this.items[index].getId().equals(id)) {
                System.arraycopy(items, index + 1, items, index, items.length);
                result = true;
                break;
            }
        }
        return result;

    }

    public Item[] findAll() {
        int check = items.length - 1;
        Item[] sort = new Item[1];
        for (int index = 0; index < check; index++) {
            if (items[index] == null) {
               sort[0] = items[index + 1];
               items[index + 1] = items[index];
               items[index] = sort[0];
               if (items[check] == null) {
                   check--;
               }
            }
        }
        return Arrays.copyOf(items, check);
    }

    public Item[] findByName(String key) {
        Item[] arrayName = new Item[100];
        for (int index = 0; index < items.length; index++){
           if (this.items[index].getName().equals(key)){
               arrayName[index] = items[index];
           }
        }
        return arrayName;

    }

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
