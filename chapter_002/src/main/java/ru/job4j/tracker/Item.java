package ru.job4j.tracker;

import java.util.Objects;

/**
 * Содержимое заявок.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 08.05.2019
 */

public class Item {
    private String id;
    private String name;
    private String decs;
    private long time;


    public Item(String name, String decs, long time) {
        this.name = name;
        this.decs = decs;
        this.time = time;
    }

    /**
     * Выдает ID заявки.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     *  Передает ID в заявку
     *
     * @param id запись ID в заявку
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *  Получить имя заявки.
     *
     * @return имя заявки.
     */
    public String getName() {
        return name;
    }

    /**
     *  Передать имя в заявку.
     *
     * @param name имя заявки.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *  Получить описание заявки.
     *
     * @return описание заявки
     */
    public String getDecs() {
        return decs;
    }

    /**
     * Передать описание в заявку.
     *
     * @param decs описание заявки.
     */
    public void setDecs(String decs) {
        this.decs = decs;
    }

    /**
     *  Получить время создания заявки.
     *
     * @return время создания заявки.
     */
    public long getTime() {
        return time;
    }

    /**
     *  Передать время в заявку.
     *
     * @param time время создания заявки.
     */
    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return time == item.time && Objects.equals(id, item.id) && Objects.equals(name, item.name) && Objects.equals(decs, item.decs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, decs, time);
    }
}